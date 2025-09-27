package data;

import model.*;
import model.enums.*;
import service.AnimalRepository;

public class BaseAnimais {

    public static void carregarDados(AnimalRepository repository) {

        // ANFÍBIOS
        repository.save(new Anfibio("Sapo-cururu", "Rhinella marina", "Brejos e matas",
                TipoAlimentacao.INSETIVORO, TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR,
                ModoLocomocao.SALTA, "Croc croc", TipoSom.VOCALIZACAO_GRAVE, true, true));

        repository.save(new Anfibio("Rã-verde", "Hypsiboas pulchellus", "Lagos, áreas úmidas",
                TipoAlimentacao.INSETIVORO, TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR,
                ModoLocomocao.SALTA, "Coaxar agudo", TipoSom.VOCALIZACAO_AGUDA, true, true));

        repository.save(new Anfibio("Salamandra", "Salamandra salamandra", "Florestas úmidas",
                TipoAlimentacao.CARNIVORO, TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR,
                ModoLocomocao.ANDA, "Sons suaves", TipoSom.SONS_SUAVES, true, true));

        repository.save(new Anfibio("Axolote", "Ambystoma mexicanum", "Lagos do México",
                TipoAlimentacao.CARNIVORO, TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR,
                ModoLocomocao.NADA, "Assobios subaquáticos", TipoSom.CANTORIA_ASSOBIO, false, true));

        repository.save(new Anfibio("Perereca", "Hyla spp.", "Árvores e matas",
                TipoAlimentacao.INSETIVORO, TipoPele.UMIDA, TipoRespiracao.CUTANEA_PULMONAR,
                ModoLocomocao.SALTA, "Coaxar leve", TipoSom.SONS_SUAVES, true, true));

        // AVES
        repository.save(new Ave("Águia", "Aquila chrysaetos", "Montanhas",
                TipoAlimentacao.CARNIVORO, TipoPele.PENAS, TipoRespiracao.PULMONAR,
                ModoLocomocao.VOA, "Grito agudo", TipoSom.VOCALIZACAO_AGUDA, true, "Curvo"));

        repository.save(new Ave("Pinguim-imperador", "Aptenodytes forsteri", "Regiões polares",
                TipoAlimentacao.PISCIVORO, TipoPele.PENAS, TipoRespiracao.PULMONAR,
                ModoLocomocao.NADA, "Grasnado", TipoSom.VOCALIZACAO_GRAVE, false, "Curto e reto"));

        repository.save(new Ave("Canário", "Serinus canaria", "Ambientes urbanos",
                TipoAlimentacao.GRANIVORO, TipoPele.PENAS, TipoRespiracao.PULMONAR,
                ModoLocomocao.VOA, "Canto melódico", TipoSom.CANTORIA_ASSOBIO, true, "Fino"));

        repository.save(new Ave("Avestruz", "Struthio camelus", "Savanas e desertos",
                TipoAlimentacao.HERBIVORO, TipoPele.PENAS, TipoRespiracao.PULMONAR,
                ModoLocomocao.CORRE, "Urrado grave", TipoSom.VOCALIZACAO_GRAVE, false, "Largo"));

        repository.save(new Ave("Tucano-toco", "Ramphastos toco", "Florestas tropicais",
                TipoAlimentacao.FRUTIVORO, TipoPele.PENAS, TipoRespiracao.PULMONAR,
                ModoLocomocao.VOA, "Sons curtos e secos", TipoSom.SONS_SUAVES, true, "Longo e largo"));

        // MAMÍFEROS
        repository.save(new Mamifero("Leão", "Panthera leo", "Savana africana",
                TipoAlimentacao.CARNIVORO, TipoPele.PELOS, TipoRespiracao.PULMONAR,
                ModoLocomocao.CORRE, "Rugido", TipoSom.VOCALIZACAO_GRAVE, 110, true, true));

        repository.save(new Mamifero("Elefante", "Loxodonta africana", "Floresta e savana",
                TipoAlimentacao.HERBIVORO, TipoPele.PELOS, TipoRespiracao.PULMONAR,
                ModoLocomocao.ANDA, "Barulho grave", TipoSom.VOCALIZACAO_GRAVE, 660, false, true));

        repository.save(new Mamifero("Baleia Azul", "Balaenoptera musculus", "Oceano",
                TipoAlimentacao.CARNIVORO, TipoPele.PELOS, TipoRespiracao.PULMONAR,
                ModoLocomocao.NADA, "Canto subaquático", TipoSom.CANTORIA_ASSOBIO, 365, false, true));

        repository.save(new Mamifero("Humano", "Homo sapiens", "Terra",
                TipoAlimentacao.ONIVORO, TipoPele.PELOS, TipoRespiracao.PULMONAR,
                ModoLocomocao.ANDA, "Fala", TipoSom.COMUNICACAO_HUMANA, 280, true, true));

        repository.save(new Mamifero("Cavalo", "Equus ferus caballus", "Campos e estepes",
                TipoAlimentacao.HERBIVORO, TipoPele.PELOS, TipoRespiracao.PULMONAR,
                ModoLocomocao.CORRE, "Relincho", TipoSom.VOCALIZACAO_AGUDA, 340, true, false));

        // PEIXES
        repository.save(new Peixe("Tubarão-branco", "Carcharodon carcharias", "Oceano aberto",
                TipoAlimentacao.CARNIVORO, TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL,
                ModoLocomocao.NADA, "Cliques/silêncio", TipoSom.SILENCIO, true, true));

        repository.save(new Peixe("Salmão", "Salmo salar", "Rios e oceanos",
                TipoAlimentacao.PISCIVORO, TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL,
                ModoLocomocao.NADA, "Ruídos suaves", TipoSom.SONS_SUAVES, false, true));

        repository.save(new Peixe("Peixe-palhaço", "Amphiprion ocellaris", "Recifes de coral",
                TipoAlimentacao.PLANCTIVORO, TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL,
                ModoLocomocao.NADA, "Quase inaudível", TipoSom.SILENCIO, true, true));

        repository.save(new Peixe("Pirarucu", "Arapaima gigas", "Rios da Amazônia",
                TipoAlimentacao.CARNIVORO, TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL,
                ModoLocomocao.NADA, "Estalo", TipoSom.SONS_SUAVES, false, true));

        repository.save(new Peixe("Lampreia", "Petromyzon marinus", "Água doce e salgada",
                TipoAlimentacao.PARASITA, TipoPele.ESCAMAS, TipoRespiracao.BRANQUIAL,
                ModoLocomocao.NADA, "Silencioso", TipoSom.SILENCIO, true, false));

        // RÉPTEIS
        repository.save(new Reptil("Cobra-real", "Ophiophagus hannah", "Florestas tropicais",
                TipoAlimentacao.CARNIVORO, TipoPele.ESCAMAS, TipoRespiracao.PULMONAR,
                ModoLocomocao.RASTEJA, "Silvo", TipoSom.SONS_SUAVES, true, "Rastejante"));

        repository.save(new Reptil("Camaleão", "Chamaeleo calyptratus", "Árvores",
                TipoAlimentacao.INSETIVORO, TipoPele.ESCAMAS, TipoRespiracao.PULMONAR,
                ModoLocomocao.ANDA, "Silencioso", TipoSom.SILENCIO, false, "Quadrúpede lento"));

        repository.save(new Reptil("Jacaré-açu", "Melanosuchus niger", "Rios da Amazônia",
                TipoAlimentacao.CARNIVORO, TipoPele.ESCAMAS, TipoRespiracao.PULMONAR,
                ModoLocomocao.NADA, "Rugido grave", TipoSom.VOCALIZACAO_GRAVE, false, "Nadador e andador"));

        repository.save(new Reptil("Tartaruga-verde", "Chelonia mydas", "Oceanos tropicais",
                TipoAlimentacao.HERBIVORO, TipoPele.ESCAMAS, TipoRespiracao.PULMONAR,
                ModoLocomocao.NADA, "Quase inaudível", TipoSom.SILENCIO, false, "Nadadora"));

        repository.save(new Reptil("Lagarto teiú", "Salvator merianae", "Cerrado e florestas",
                TipoAlimentacao.ONIVORO, TipoPele.ESCAMAS, TipoRespiracao.PULMONAR,
                ModoLocomocao.ANDA, "Estalo curto", TipoSom.SONS_SUAVES, false, "Quadrúpede ágil"));
    }
}