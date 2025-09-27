# 🐾Zoologic
 
 **Zoologic** é um projeto Java em desenvolvimento que simula um sistema de classificação e gerenciamento de animais vertebrados do filo Chordata. O objetivo é aplicar conceitos de **Programação Orientada a Objetos (POO)**, organização de pacotes, uso de **Enums, encapsulamento, herança, polimorfismo** e boas práticas de código em um projeto real.

## 📌 Sobre o Projeto
O sistema permite consultar e exibir informações detalhadas sobre diferentes classes de animais:

* 🦁 Mamíferos
* 🐦 Aves
* 🐍 Répteis
* 🐟 Peixes
* 🐸 Anfíbios

Cada classe animal possui **atributos específicos** e **métodos próprios** que sobrescrevem comportamentos comuns da superclasse `Chordata`.

## 📂 Estrutura de Pacotes
```
zoologic/
│
├── data/               // Armazena dados estáticos ou pré-carregados
│   └── BaseAnimais.java
│
├── main/               // Ponto de entrada
│   └── Main.java
│
├── model/               // Classes de espécies animais
│   ├── Mamifero.java
│   ├── Ave.java
│   ├── Chordata.java
│   ├── Reptil.java
│   ├── Peixe.java
│   └── Anfibio.java
│
├── model/enums/         // Enums de classificação e características
│   ├── CategoriaHabitat.java
│   ├── ClasseAnimal.java
│   ├── ModoLocomocao.java
│   ├── TipoAlimentacao.java
│   ├── TipoPele.java
│   ├── TipoRespiracao.java	
│   └── TipoSom.java
│
├── service/             // Lógica de negócio, filtros e buscas
│   ├── AnimalRepository.java
│   ├── AnimalService.java
│   └── InMemoryAnimalRepository.java
│
└── view/                // Interface com o usuário
    └── MainMenu.java

```

## ✅ Funcionalidades atuais

- 📋 Consulta de diferentes animais por classe
- 📋 Consulta específica de um animal e suas características
- 🔍 Filtro por Classe
- 🔍 Filtro por tipo de Alimentação
- 🔍 Filtro por tipo de Habitat
- 🔍 Filtro por modo de Locomoção
- 🔍 Filtro por tipo de Pele
- 🔍 Filtro por tipo de Respiração
- 🔍 Filtro por tipo de Som
- 🧪 Listagem de características próprias: venenosos, tipo de bico, escamas e etc.
- 🔠 Busca por nome popular

### 🚧 Em desenvolvimento
Algumas funcionalidades estão previstas para versões futuras:

- 🔁 Simulação de interações alimentares ("quem come quem")
- 🌐 Armazenamento e leitura de dados via arquivos ou banco de dados
- ✅ Testes unitários automatizados
- 📝 Interface gráfica (GUI)

## 🤝 Contribuições
Este projeto está **aberto para contribuições**! Se você quer ajudar com ideias e melhorias, sinta-se à vontade para abrir um **Pull Request ou Issue**.

## 👨‍💻 Autor
Sou aluno de **Ciências da Computação**, aprendiz de **Java** e **desenvolvedor full stack** em formação. Se quiser trocar ideia ou colaborar, é só chamar!

## 📄 Licença
Este projeto está sob a **licença MIT**. Sinta-se livre para usar, modificar e compartilhar.
