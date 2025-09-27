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
        int opcao = -1;
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

            try {
                opcao = Integer.parseInt(scanner.nextLine());

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
                    case 0 -> System.out.println("\nEncerrando o programa...");
                    default -> System.out.println("\nOpção inválida. Digite um número entre 0 e 9.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada inválida! Digite um número.");
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

        try {
            int escolha = Integer.parseInt(scanner.nextLine());
            String classeInput = switch (escolha) {
                case 1 -> "Mamífero";
                case 2 -> "Ave";
                case 3 -> "Anfíbio";
                case 4 -> "Peixe";
                case 5 -> "Réptil";
                default -> null;
            };

            if (classeInput == null) {
                System.out.println("\nOpção inválida.");
                return;
            }

            List<Chordata> filtrados = animalService.getAnimaisPorClasse(classeInput);
            if (filtrados.isEmpty()) {
                System.out.println("\nNenhum animal encontrado para a classe informada.");
            } else {
                System.out.println("\nAnimais da classe " + classeInput + ":");
                for (int i = 0; i < filtrados.size(); i++) {
                    System.out.println((i + 1) + " - " + filtrados.get(i).getNomePopular());
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\nEntrada inválida! Digite um número.");
        }
    }

    private void filtrarPorAlimentacao() {
        TipoAlimentacao[] tipos = TipoAlimentacao.values();
        System.out.println("\nSelecione o tipo de alimentação:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + " - " + tipos[i]);
        }
        System.out.print("Escolha uma opção: ");

        try {
            int escolha = Integer.parseInt(scanner.nextLine());
            if (escolha < 1 || escolha > tipos.length) {
                System.out.println("\nOpção inválida.");
                return;
            }

            TipoAlimentacao tipo = tipos[escolha - 1];
            List<Chordata> filtrados = animalService.filtrarPorAlimentacao(tipo);

            if (filtrados.isEmpty()) {
                System.out.println("\nNenhum animal encontrado com esse tipo de alimentação.");
            } else {
                System.out.println("\nAnimais encontrados:");
                for (int i = 0; i < filtrados.size(); i++) {
                    System.out.println((i + 1) + " - " + filtrados.get(i).getNomePopular() + " (" + tipo + ")");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\nEntrada inválida! Digite um número.");
        }
    }

    private void filtrarPorCategoriaHabitat() {
        System.out.println("\nSelecione a categoria de habitat:");
        System.out.println("1 - Aquático");
        System.out.println("2 - Florestal");
        System.out.println("3 - Terrestre");
        System.out.println("4 - Urbano");
        System.out.print("Escolha uma opção: ");

        try {
            int escolha = Integer.parseInt(scanner.nextLine());
            CategoriaHabitat categoria = switch (escolha) {
                case 1 -> CategoriaHabitat.Aquático;
                case 2 -> CategoriaHabitat.Florestal;
                case 3 -> CategoriaHabitat.Terrestre;
                case 4 -> CategoriaHabitat.Urbano;
                default -> null;
            };

            if (categoria == null) {
                System.out.println("\nOpção inválida.");
                return;
            }

            List<Chordata> filtrados = animalService.filtrarPorCategoriaHabitat(categoria);
            if (filtrados.isEmpty()) {
                System.out.println("\nNenhum animal encontrado.");
            } else {
                System.out.println("\nAnimais encontrados:");
                for (int i = 0; i < filtrados.size(); i++) {
                    System.out.println((i + 1) + " - " + filtrados.get(i).getNomePopular() + " (" + filtrados.get(i).getHabitat() + ")");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\nEntrada inválida! Digite um número.");
        }
    }

    private void filtrarPorLocomocao() {
        ModoLocomocao[] modos = ModoLocomocao.values();
        System.out.println("\nEscolha o modo de locomoção:");
        for (int i = 0; i < modos.length; i++) {
            System.out.println((i + 1) + " - " + modos[i]);
        }
        System.out.print("Escolha uma opção: ");

        try {
            int escolha = Integer.parseInt(scanner.nextLine());
            if (escolha < 1 || escolha > modos.length) {
                System.out.println("\nOpção inválida.");
                return;
            }

            ModoLocomocao modo = modos[escolha - 1];
            List<Chordata> filtrados = animalService.filtrarPorLocomocao(modo);

            if (filtrados.isEmpty()) {
                System.out.println("\nNenhum animal encontrado.");
            } else {
                System.out.println("\nAnimais encontrados:");
                for (int i = 0; i < filtrados.size(); i++) {
                    System.out.println((i + 1) + " - " + filtrados.get(i).getNomePopular());
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\nEntrada inválida! Digite um número.");
        }
    }

    private void filtrarPorTipoPele() {
        TipoPele[] tipos = TipoPele.values();
        System.out.println("\nEscolha o tipo de pele:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + " - " + tipos[i]);
        }
        System.out.print("Escolha uma opção: ");

        try {
            int escolha = Integer.parseInt(scanner.nextLine());
            if (escolha < 1 || escolha > tipos.length) {
                System.out.println("\nOpção inválida.");
                return;
            }

            TipoPele tipo = tipos[escolha - 1];
            List<Chordata> filtrados = animalService.filtrarPorTipoPele(tipo);

            if (filtrados.isEmpty()) {
                System.out.println("\nNenhum animal encontrado.");
            } else {
                System.out.println("\nAnimais encontrados:");
                for (int i = 0; i < filtrados.size(); i++) {
                    System.out.println((i + 1) + " - " + filtrados.get(i).getNomePopular());
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\nEntrada inválida! Digite um número.");
        }
    }

    private void filtrarPorTipoRespiracao() {
        TipoRespiracao[] tipos = TipoRespiracao.values();
        System.out.println("\nEscolha o tipo de respiração:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + " - " + tipos[i]);
        }
        System.out.print("Escolha uma opção: ");

        try {
            int escolha = Integer.parseInt(scanner.nextLine());
            if (escolha < 1 || escolha > tipos.length) {
                System.out.println("\nOpção inválida.");
                return;
            }

            TipoRespiracao tipo = tipos[escolha - 1];
            List<Chordata> filtrados = animalService.filtrarPorTipoRespiracao(tipo);

            if (filtrados.isEmpty()) {
                System.out.println("\nNenhum animal encontrado.");
            } else {
                System.out.println("\nAnimais encontrados:");
                for (int i = 0; i < filtrados.size(); i++) {
                    System.out.println((i + 1) + " - " + filtrados.get(i).getNomePopular());
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\nEntrada inválida! Digite um número.");
        }
    }

    private void filtrarPorTipoSom() {
        TipoSom[] tipos = TipoSom.values();
        System.out.println("\nEscolha o tipo de som:");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + " - " + tipos[i].getDescricao());
        }
        System.out.print("Escolha uma opção: ");

        try {
            int escolha = Integer.parseInt(scanner.nextLine());
            if (escolha < 1 || escolha > tipos.length) {
                System.out.println("\nOpção inválida.");
                return;
            }

            TipoSom tipo = tipos[escolha - 1];
            List<Chordata> filtrados = animalService.filtrarPorTipoSom(tipo);

            if (filtrados.isEmpty()) {
                System.out.println("\nNenhum animal encontrado.");
            } else {
                System.out.println("\nAnimais encontrados:");
                for (int i = 0; i < filtrados.size(); i++) {
                    System.out.println((i + 1) + " - " + filtrados.get(i).getNomePopular() + " (Som: " + filtrados.get(i).getSomEmitido() + ")");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("\nEntrada inválida! Digite um número.");
        }
    }
}