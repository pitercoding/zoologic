package view;

import model.Chordata;
import model.enums.*;
import service.AnimalService;

import java.util.List;
import java.util.Scanner;

public class MainMenu {

    private final AnimalService animalService;
    private final Scanner scanner;

    public MainMenu(AnimalService animalService) {
        this.animalService = animalService;
        this.scanner = new Scanner(System.in);
    }

    public void exibir() {
        int opcao;
        do {
            System.out.println("\n===== MENU PRINCIPAL ZOOLOGIC =====");
            System.out.println("1. Listar todos os animais");
            System.out.println("2. Ver detalhes de um animal específico");
            System.out.println("3. Filtro: Classe");
            System.out.println("4. Filtro: Alimentação");
            System.out.println("5. Filtro: Habitat");
            System.out.println("6. Filtro: Locomoção");
            System.out.println("7. Filtro: Pele");
            System.out.println("8. Filtro: Respiração");
            System.out.println("9. Filtro: Som");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> animalService.listarTodosAnimais();
                case 2 -> animalService.verDetalhes(scanner);
                case 3 -> filtrarPorClasse();
                case 4 -> filtrarPorAlimentacao();
                case 5 -> filtrarPorCategoriaHabitat();
                case 6 -> filtrarPorLocomocao();
                case 7 -> filtrarPorTipoPele();
                case 8 -> filtrarPorTipoRespiracao();
                case 9 -> filtrarPorTipoSom();
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
    }

    // ---------------------- FILTROS ----------------------

    private void filtrarPorClasse() {
        System.out.println("\nDigite a classe:");
        System.out.println("1 - Mamífero");
        System.out.println("2 - Ave");
        System.out.println("3 - Anfíbio");
        System.out.println("4 - Peixe");
        System.out.println("5 - Réptil");
        System.out.print("Escolha uma opção: ");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        String classeInput = switch (escolha) {
            case 1 -> "MAMIFERO";
            case 2 -> "AVE";
            case 3 -> "ANFIBIO";
            case 4 -> "PEIXE";
            case 5 -> "REPTIL";
            default -> null;
        };

        if (classeInput == null) {
            System.out.println("Opção inválida.");
            return;
        }

        List<Chordata> filtrados = animalService.getAnimaisPorClasse(classeInput);
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum animal encontrado para a classe informada.");
        } else {
            System.out.println("\nAnimais da classe " + classeInput + ":");
            filtrados.forEach(a -> System.out.println("- " + a.getNomePopular()));
        }
    }

    private void filtrarPorAlimentacao() {
        TipoAlimentacao[] tipos = TipoAlimentacao.values();
        System.out.println("\nSelecione o tipo de alimentação:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + " - " + tipos[i]);
        }

        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 1 || escolha > tipos.length) {
            System.out.println("Opção inválida.");
            return;
        }

        TipoAlimentacao tipo = tipos[escolha - 1];
        List<Chordata> filtrados = animalService.filtrarPorAlimentacao(tipo);

        if (filtrados.isEmpty()) {
            System.out.println("Nenhum animal encontrado com esse tipo de alimentação.");
        } else {
            System.out.println("\nAnimais encontrados:");
            filtrados.forEach(a -> System.out.println("- " + a.getNomePopular() + " (" + tipo + ")"));
        }
    }

    private void filtrarPorCategoriaHabitat() {
        System.out.println("\nSelecione a categoria de habitat:");
        System.out.println("1 - Aquático");
        System.out.println("2 - Florestal");
        System.out.println("3 - Terrestre");
        System.out.println("4 - Urbano");
        System.out.print("Escolha uma opção: ");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        CategoriaHabitat categoria = switch (escolha) {
            case 1 -> CategoriaHabitat.AQUATICO;
            case 2 -> CategoriaHabitat.FLORESTAL;
            case 3 -> CategoriaHabitat.TERRESTRE;
            case 4 -> CategoriaHabitat.URBANO;
            default -> null;
        };

        if (categoria == null) {
            System.out.println("Opção inválida.");
            return;
        }

        List<Chordata> filtrados = animalService.filtrarPorCategoriaHabitat(categoria);
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum animal encontrado.");
        } else {
            System.out.println("\nAnimais encontrados:");
            filtrados.forEach(a -> System.out.println("- " + a.getNomePopular() + " (" + a.getHabitat() + ")"));
        }
    }

    private void filtrarPorLocomocao() {
        ModoLocomocao[] modos = ModoLocomocao.values();
        System.out.println("\nEscolha o modo de locomoção:");
        for (int i = 0; i < modos.length; i++) {
            System.out.println(i + " - " + modos[i]);
        }

        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 0 || escolha >= modos.length) {
            System.out.println("Opção inválida.");
            return;
        }

        ModoLocomocao modo = modos[escolha];
        List<Chordata> filtrados = animalService.filtrarPorLocomocao(modo);
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum animal encontrado.");
        } else {
            System.out.println("\nAnimais encontrados:");
            filtrados.forEach(System.out::println);
        }
    }

    private void filtrarPorTipoPele() {
        TipoPele[] tipos = TipoPele.values();
        System.out.println("\nEscolha o tipo de pele:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(i + 1 + " - " + tipos[i]);
        }

        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 1 || escolha > tipos.length) {
            System.out.println("Opção inválida.");
            return;
        }

        TipoPele tipo = tipos[escolha - 1];
        List<Chordata> filtrados = animalService.filtrarPorTipoPele(tipo);
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum animal encontrado.");
        } else {
            System.out.println("\nAnimais encontrados:");
            filtrados.forEach(System.out::println);
        }
    }

    private void filtrarPorTipoRespiracao() {
        TipoRespiracao[] tipos = TipoRespiracao.values();
        System.out.println("\nEscolha o tipo de respiração:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(i + 1 + " - " + tipos[i]);
        }

        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 1 || escolha > tipos.length) {
            System.out.println("Opção inválida.");
            return;
        }

        TipoRespiracao tipo = tipos[escolha - 1];
        List<Chordata> filtrados = animalService.filtrarPorTipoRespiracao(tipo);
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum animal encontrado.");
        } else {
            System.out.println("\nAnimais encontrados:");
            filtrados.forEach(System.out::println);
        }
    }

    private void filtrarPorTipoSom() {
        TipoSom[] tipos = TipoSom.values();
        System.out.println("\nEscolha o tipo de som:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(i + 1 + " - " + tipos[i].getDescricao());
        }

        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha < 1 || escolha > tipos.length) {
            System.out.println("Opção inválida.");
            return;
        }

        TipoSom tipo = tipos[escolha - 1];
        List<Chordata> filtrados = animalService.filtrarPorTipoSom(tipo);
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum animal encontrado.");
        } else {
            System.out.println("\nAnimais encontrados:");
            filtrados.forEach(a -> System.out.println("- " + a.getNomePopular() + " (Som: " + a.getSomEmitido() + ")"));
        }
    }
}
