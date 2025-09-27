package data;

import model.*;
import model.enums.*;
import service.AnimalRepository;

public class BaseAnimais {

    public static void carregarDados(AnimalRepository repository) {

        // ANFÍBIOS
        repository.save(new Anfibio("Sapo-cururu", "Rhinella marina", "Brejos e matas",
                TipoAlimentacao.Insetívoro, TipoPele.Úmida, TipoRespiracao.Cutânea_Pulmonar,
                ModoLocomocao.Salta, "Croc croc", TipoSom.Vocalização_Grave, true, true));

        repository.save(new Anfibio("Rã-verde", "Hypsiboas pulchellus", "Lagos, áreas úmidas",
                TipoAlimentacao.Insetívoro, TipoPele.Úmida, TipoRespiracao.Cutânea_Pulmonar,
                ModoLocomocao.Salta, "Coaxar agudo", TipoSom.Vocalização_Aguda, true, true));

        repository.save(new Anfibio("Salamandra", "Salamandra salamandra", "Florestas úmidas",
                TipoAlimentacao.Carnívoro, TipoPele.Úmida, TipoRespiracao.Cutânea_Pulmonar,
                ModoLocomocao.Anda, "Sons suaves", TipoSom.Sons_Suaves, true, true));

        repository.save(new Anfibio("Axolote", "Ambystoma mexicanum", "Lagos do México",
                TipoAlimentacao.Carnívoro, TipoPele.Úmida, TipoRespiracao.Cutânea_Pulmonar,
                ModoLocomocao.Nada, "Assobios subaquáticos", TipoSom.Cantoria_Assobio, false, true));

        repository.save(new Anfibio("Perereca", "Hyla spp.", "Árvores e matas",
                TipoAlimentacao.Insetívoro, TipoPele.Úmida, TipoRespiracao.Cutânea_Pulmonar,
                ModoLocomocao.Salta, "Coaxar leve", TipoSom.Sons_Suaves, true, true));

        // AVES
        repository.save(new Ave("Águia", "Aquila chrysaetos", "Montanhas",
                TipoAlimentacao.Carnívoro, TipoPele.Penas, TipoRespiracao.Pulmonar,
                ModoLocomocao.Voa, "Grito agudo", TipoSom.Vocalização_Aguda, true, "Curvo"));

        repository.save(new Ave("Pinguim-imperador", "Aptenodytes forsteri", "Regiões polares",
                TipoAlimentacao.Piscívoro, TipoPele.Penas, TipoRespiracao.Pulmonar,
                ModoLocomocao.Nada, "Grasnado", TipoSom.Vocalização_Grave, false, "Curto e reto"));

        repository.save(new Ave("Canário", "Serinus canaria", "Ambientes urbanos",
                TipoAlimentacao.Granívoro, TipoPele.Penas, TipoRespiracao.Pulmonar,
                ModoLocomocao.Voa, "Canto melódico", TipoSom.Cantoria_Assobio, true, "Fino"));

        repository.save(new Ave("Avestruz", "Struthio camelus", "Savanas e desertos",
                TipoAlimentacao.Herbívoro, TipoPele.Penas, TipoRespiracao.Pulmonar,
                ModoLocomocao.Corre, "Urrado grave", TipoSom.Vocalização_Grave, false, "Largo"));

        repository.save(new Ave("Tucano-toco", "Ramphastos toco", "Florestas tropicais",
                TipoAlimentacao.Frutívoro, TipoPele.Penas, TipoRespiracao.Pulmonar,
                ModoLocomocao.Voa, "Sons curtos e secos", TipoSom.Sons_Suaves, true, "Longo e largo"));

        // MAMÍFEROS
        repository.save(new Mamifero("Leão", "Panthera leo", "Savana africana",
                TipoAlimentacao.Carnívoro, TipoPele.Pelos, TipoRespiracao.Pulmonar,
                ModoLocomocao.Corre, "Rugido", TipoSom.Vocalização_Grave, 110, true, true));

        repository.save(new Mamifero("Elefante", "Loxodonta africana", "Floresta e savana",
                TipoAlimentacao.Herbívoro, TipoPele.Pelos, TipoRespiracao.Pulmonar,
                ModoLocomocao.Anda, "Barulho grave", TipoSom.Vocalização_Grave, 660, false, true));

        repository.save(new Mamifero("Baleia Azul", "Balaenoptera musculus", "Oceano",
                TipoAlimentacao.Carnívoro, TipoPele.Pelos, TipoRespiracao.Pulmonar,
                ModoLocomocao.Nada, "Canto subaquático", TipoSom.Cantoria_Assobio, 365, false, true));

        repository.save(new Mamifero("Humano", "Homo sapiens", "Terra",
                TipoAlimentacao.Onívoro, TipoPele.Pelos, TipoRespiracao.Pulmonar,
                ModoLocomocao.Anda, "Fala", TipoSom.Comunicação_Humana, 280, true, true));

        repository.save(new Mamifero("Cavalo", "Equus ferus caballus", "Campos e estepes",
                TipoAlimentacao.Herbívoro, TipoPele.Pelos, TipoRespiracao.Pulmonar,
                ModoLocomocao.Corre, "Relincho", TipoSom.Vocalização_Aguda, 340, true, false));

        // PEIXES
        repository.save(new Peixe("Tubarão-branco", "Carcharodon carcharias", "Oceano aberto",
                TipoAlimentacao.Carnívoro, TipoPele.Escamas, TipoRespiracao.Branquial,
                ModoLocomocao.Nada, "Cliques/silêncio", TipoSom.Silêncio, true, true));

        repository.save(new Peixe("Salmão", "Salmo salar", "Rios e oceanos",
                TipoAlimentacao.Piscívoro, TipoPele.Escamas, TipoRespiracao.Branquial,
                ModoLocomocao.Nada, "Ruídos suaves", TipoSom.Sons_Suaves, false, true));

        repository.save(new Peixe("Peixe-palhaço", "Amphiprion ocellaris", "Recifes de coral",
                TipoAlimentacao.Planctívoro, TipoPele.Escamas, TipoRespiracao.Branquial,
                ModoLocomocao.Nada, "Quase inaudível", TipoSom.Silêncio, true, true));

        repository.save(new Peixe("Pirarucu", "Arapaima gigas", "Rios da Amazônia",
                TipoAlimentacao.Carnívoro, TipoPele.Escamas, TipoRespiracao.Branquial,
                ModoLocomocao.Nada, "Estalo", TipoSom.Sons_Suaves, false, true));

        repository.save(new Peixe("Lampreia", "Petromyzon marinus", "Água doce e salgada",
                TipoAlimentacao.Parasita, TipoPele.Escamas, TipoRespiracao.Branquial,
                ModoLocomocao.Nada, "Silencioso", TipoSom.Silêncio, true, false));

        // RÉPTEIS
        repository.save(new Reptil("Cobra-real", "Ophiophagus hannah", "Florestas tropicais",
                TipoAlimentacao.Carnívoro, TipoPele.Escamas, TipoRespiracao.Pulmonar,
                ModoLocomocao.Rasteja, "Silvo", TipoSom.Sons_Suaves, true, "Rastejante"));

        repository.save(new Reptil("Camaleão", "Chamaeleo calyptratus", "Árvores",
                TipoAlimentacao.Insetívoro, TipoPele.Escamas, TipoRespiracao.Pulmonar,
                ModoLocomocao.Anda, "Silencioso", TipoSom.Silêncio, false, "Quadrúpede lento"));

        repository.save(new Reptil("Jacaré-açu", "Melanosuchus niger", "Rios da Amazônia",
                TipoAlimentacao.Carnívoro, TipoPele.Escamas, TipoRespiracao.Pulmonar,
                ModoLocomocao.Nada, "Rugido grave", TipoSom.Vocalização_Grave, false, "Nadador e andador"));

        repository.save(new Reptil("Tartaruga-verde", "Chelonia mydas", "Oceanos tropicais",
                TipoAlimentacao.Herbívoro, TipoPele.Escamas, TipoRespiracao.Pulmonar,
                ModoLocomocao.Nada, "Quase inaudível", TipoSom.Silêncio, false, "Nadadora"));

        repository.save(new Reptil("Lagarto teiú", "Salvator merianae", "Cerrado e florestas",
                TipoAlimentacao.Onívoro, TipoPele.Escamas, TipoRespiracao.Pulmonar,
                ModoLocomocao.Anda, "Estalo curto", TipoSom.Sons_Suaves, false, "Quadrúpede ágil"));
    }
}