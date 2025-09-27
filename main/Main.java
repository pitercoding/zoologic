package main;

import service.*;
import view.MainMenu;
import data.BaseAnimais;

public class Main {

    public static void main(String[] args) {

        // 1. Cria o repositório em memória
        InMemoryAnimalRepository repository = new InMemoryAnimalRepository();

        // 2. Carrega os dados iniciais no repositório
        BaseAnimais.carregarDados(repository);

        // 3. Cria o serviço de animais usando o repositório
        AnimalService animalService = new AnimalService(repository);

        // 4. Inicializa e exibe o menu principal
        MainMenu menu = new MainMenu(animalService);
        menu.exibir();
    }
}