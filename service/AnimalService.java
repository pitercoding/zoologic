package service;

import model.Chordata;
import model.enums.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    // CRUD e filtros
    public List<Chordata> getTodosAnimais() {
        return repository.findAll();
    }

    public Chordata getAnimalPorIndice(int index) {
        List<Chordata> animais = repository.findAll();
        if (index >= 0 && index < animais.size()) return animais.get(index);
        return null;
    }

    public void adicionarAnimal(Chordata animal) {
        repository.save(animal);
    }

    public void removerAnimal(Chordata animal) {
        repository.delete(animal);
    }

    public void atualizarAnimal(int index, Chordata animalAtualizado) {
        repository.update(index, animalAtualizado);
    }

    public List<Chordata> getAnimaisPorClasse(String classeInput) {
        try {
            ClasseAnimal classe = ClasseAnimal.valueOf(classeInput);
            return repository.findAll().stream()
                    .filter(a -> a.getClasseAnimal() == classe)
                    .collect(Collectors.toList());
        } catch (IllegalArgumentException e) {
            System.out.println("Classe inválida: " + classeInput);
            return List.of();
        }
    }

    public List<Chordata> filtrarPorAlimentacao(TipoAlimentacao tipo) {
        return repository.findAll().stream()
                .filter(a -> a.getAlimentacao() == tipo)
                .collect(Collectors.toList());
    }

    public List<Chordata> filtrarPorCategoriaHabitat(CategoriaHabitat categoria) {
        return repository.findAll().stream()
                .filter(animal -> {
                    String habitat = animal.getHabitat().toLowerCase();
                    switch (categoria) {
                        case Aquático:
                            return habitat.contains("oceano") || habitat.contains("água") ||
                                    habitat.contains("lago") || habitat.contains("rio") ||
                                    habitat.contains("recife") || habitat.contains("polar");
                        case Florestal:
                            return habitat.contains("floresta") || habitat.contains("árvore") ||
                                    habitat.contains("mata") || habitat.contains("cerrado");
                        case Terrestre:
                            return habitat.contains("terra") || habitat.contains("savana") ||
                                    habitat.contains("deserto") || habitat.contains("montanha") ||
                                    habitat.contains("campo") || habitat.contains("estepe");
                        case Urbano:
                            return habitat.contains("urbano");
                        default:
                            return false;
                    }
                })
                .collect(Collectors.toList());
    }

    public List<Chordata> filtrarPorLocomocao(ModoLocomocao modo) {
        return repository.findAll().stream()
                .filter(a -> a.getModoLocomocao() == modo)
                .collect(Collectors.toList());
    }

    public List<Chordata> filtrarPorTipoPele(TipoPele tipo) {
        return repository.findAll().stream()
                .filter(a -> a.getTipoPele() == tipo)
                .collect(Collectors.toList());
    }

    public List<Chordata> filtrarPorTipoRespiracao(TipoRespiracao tipo) {
        return repository.findAll().stream()
                .filter(a -> a.getTipoRespiracao() == tipo)
                .collect(Collectors.toList());
    }

    public List<Chordata> filtrarPorTipoSom(TipoSom tipo) {
        return repository.findAll().stream()
                .filter(a -> a.getTipoSom() == tipo)
                .collect(Collectors.toList());
    }

    // Console
    public void listarTodosAnimais() {
        System.out.println("\n-- Lista de todos os animais --");
        List<Chordata> animais = getTodosAnimais();
        for (int i = 0; i < animais.size(); i++) {
            System.out.println((i + 1) + " - " + animais.get(i).getNomePopular());
        }
    }

    public void verDetalhes(Scanner scanner) {
        System.out.print("Digite o índice do animal: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        Chordata animal = getAnimalPorIndice(index - 1);
        if (animal != null) {
            animal.exibirInfo();
        } else {
            System.out.println("\nÍndice inválido.");
        }
    }

    public void buscarPorNome(String nome) {
        repository.findAll().stream()
                .filter(a -> a.getNomePopular().toLowerCase().contains(nome.toLowerCase()))
                .forEach(Chordata::exibirInfo);
    }
}