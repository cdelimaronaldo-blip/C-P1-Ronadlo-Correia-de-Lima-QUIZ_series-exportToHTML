import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Exibir o cabeçalho
        Cabecalho.escreverCabecalho();

        // 2. Criar vetor de 15 questões
        Questao[] quiz = new Questao[15];

        // -------------------------------------------------------------
        // Instanciando as 15 perguntas
        // -------------------------------------------------------------
        
        quiz[0] = new Questao();
        quiz[0].pergunta = "1) Em 'Stranger Things', qual é o nome da cidade fictícia onde se passa a história?";
        quiz[0].opcaoA = "A) Hawkins";
        quiz[0].opcaoB = "B) Riverdale";
        quiz[0].opcaoC = "C) Mystic Falls";
        quiz[0].opcaoD = "D) Sunnydale";
        quiz[0].opcaoE = "E) Derry";
        quiz[0].correta = "A";

        quiz[1] = new Questao();
        quiz[1].pergunta = "2) Qual é a profissão original de Walter White no início de 'Breaking Bad'?";
        quiz[1].opcaoA = "A) Advogado";
        quiz[1].opcaoB = "B) Médico";
        quiz[1].opcaoC = "C) Professor de Química";
        quiz[1].opcaoD = "D) Policial";
        quiz[1].opcaoE = "E) Engenheiro Químico";
        quiz[1].correta = "C";

        quiz[2] = new Questao();
        quiz[2].pergunta = "3) Em 'Friends', qual das personagens é chef/cozinheira profissional?";
        quiz[2].opcaoA = "A) Rachel Green";
        quiz[2].opcaoB = "B) Monica Geller";
        quiz[2].opcaoC = "C) Phoebe Buffay";
        quiz[2].opcaoD = "D) Janis";
        quiz[2].opcaoE = "E) Amy Green";
        quiz[2].correta = "B";

        quiz[3] = new Questao();
        quiz[3].pergunta = "4) Em 'Game of Thrones', qual é o lema da Casa Stark?";
        quiz[3].opcaoA = "A) Fogo e Sangue";
        quiz[3].opcaoB = "B) O Inverno Está Chegando";
        quiz[3].opcaoC = "C) Nosso é o Furor";
        quiz[3].opcaoD = "D) Um Lannister Sempre Paga Suas Dívidas";
        quiz[3].opcaoE = "E) Crescendo Fortes";
        quiz[3].correta = "B";

        quiz[4] = new Questao();
        quiz[4].pergunta = "5) Em 'The Office', qual é o nome da empresa de papel onde eles trabalham?";
        quiz[4].opcaoA = "A) Dunder Mifflin";
        quiz[4].opcaoB = "B) Sabre";
        quiz[4].opcaoC = "C) Sterling Cooper";
        quiz[4].opcaoD = "D) Initech";
        quiz[4].opcaoE = "E) Wayne Enterprises";
        quiz[4].correta = "A";

        quiz[5] = new Questao();
        quiz[5].pergunta = "6) Em 'Round 6', qual é o primeiro jogo disputado pelos participantes?";
        quiz[5].opcaoA = "A) Batatinha Frita 1, 2, 3";
        quiz[5].opcaoB = "B) Cabo de Guerra";
        quiz[5].opcaoC = "C) Jogo de Bolinhas de Gude";
        quiz[5].opcaoD = "D) Ponte de Vidro";
        quiz[5].opcaoE = "E) Amarelinha";
        quiz[5].correta = "A";

        quiz[6] = new Questao();
        quiz[6].pergunta = "7) Em 'Peaky Blinders', qual é o sobrenome da família principal?";
        quiz[6].opcaoA = "A) Corleone";
        quiz[6].opcaoB = "B) Shelby";
        quiz[6].opcaoC = "C) Soprano";
        quiz[6].opcaoD = "D) Shelbyville";
        quiz[6].opcaoE = "E) Birmingham";
        quiz[6].correta = "B";

        quiz[7] = new Questao();
        quiz[7].pergunta = "8) Em 'The Last of Us', que tipo de organismo causa a infecção mundial?";
        quiz[7].opcaoA = "A) Vírus T";
        quiz[7].opcaoB = "B) Fungo Cordyceps";
        quiz[7].opcaoC = "C) Cordyceps Mutante";
        quiz[7].opcaoD = "D) Parasita Las Plagas";
        quiz[7].opcaoE = "E) Bactéria X";
        quiz[7].correta = "B";

        quiz[8] = new Questao();
        quiz[8].pergunta = "9) Em 'La Casa de Papel', qual o codinome do líder intelectual do assalto?";
        quiz[8].opcaoA = "A) Berlim";
        quiz[8].opcaoB = "B) O Professor";
        quiz[8].opcaoC = "C) Palermo";
        quiz[8].opcaoD = "D) Moscou";
        quiz[8].opcaoE = "E) Denver";
        quiz[8].correta = "B";

        quiz[9] = new Questao();
        quiz[9].pergunta = "10) 'House of the Dragon' é focada na história de qual família?";
        quiz[9].opcaoA = "A) Targaryen";
        quiz[9].opcaoB = "B) Baratheon";
        quiz[9].opcaoC = "C) Lannister";
        quiz[9].opcaoD = "D) Hightower";
        quiz[9].opcaoE = "E) Velaryon";
        quiz[9].correta = "A";

        quiz[10] = new Questao();
        quiz[10].pergunta = "11) Em 'The Boys', qual é o nome do principal grupo de super-heróis?";
        quiz[10].opcaoA = "A) Os Sete";
        quiz[10].opcaoB = "B) Liga da Justiça";
        quiz[10].opcaoC = "C) Vingadores";
        quiz[10].opcaoD = "D) Os Guardiões";
        quiz[10].opcaoE = "E) Os Supostos";
        quiz[10].correta = "A";

        quiz[11] = new Questao();
        quiz[11].pergunta = "12) Em 'Wandinha', qual o nome da escola para onde a personagem vai?";
        quiz[11].opcaoA = "A) Escola Nunca Mais (Nevermore)";
        quiz[11].opcaoB = "B) Hogwarts";
        quiz[11].opcaoC = "C) Instituto Salvatore";
        quiz[11].opcaoD = "D) Alfea";
        quiz[11].opcaoE = "E) Constance Billard";
        quiz[11].correta = "A";

        quiz[12] = new Questao();
        quiz[12].pergunta = "13) Em 'Grey's Anatomy', qual a especialidade médica de Derek Shepherd?";
        quiz[12].opcaoA = "A) Cirurgia Cardiotorácica";
        quiz[12].opcaoB = "B) Neurocirurgia";
        quiz[12].opcaoC = "C) Cirurgia Pediátrica";
        quiz[12].opcaoD = "D) Ortopedia";
        quiz[12].opcaoE = "E) Cirurgia Geral";
        quiz[12].correta = "B";

        quiz[13] = new Questao();
        quiz[13].pergunta = "14) Em qual cidade alemã se passa a história de 'Dark'?";
        quiz[13].opcaoA = "A) Berlim";
        quiz[13].opcaoB = "B) Winden";
        quiz[13].opcaoC = "C) Munique";
        quiz[13].opcaoD = "D) Frankfurt";
        quiz[13].opcaoE = "E) Leipzig";
        quiz[13].correta = "B";

        quiz[14] = new Questao();
        quiz[14].pergunta = "15) Em 'Brooklyn Nine-Nine', qual é o número do distrito policial?";
        quiz[14].opcaoA = "A) 99";
        quiz[14].opcaoB = "B) 12";
        quiz[14].opcaoC = "C) 51";
        quiz[14].opcaoD = "D) 21";
        quiz[14].opcaoE = "E) 100";
        quiz[14].correta = "A";

        // 3. Execução do Quiz
        int totalAcertos = 0;

        for (int i = 0; i < quiz.length; i++) {
            quiz[i].escrevaQuestao();
            String respostaUsuario = quiz[i].leiaResposta();

            if (quiz[i].isCorreta(respostaUsuario)) {
                totalAcertos++;
            }
            System.out.println();
        }

        // 4. Cálculo da Média e Exibição de Resultados[cite: 1]
        double media = ((double) totalAcertos / quiz.length) * 100.0;

        System.out.println("==================================================");
        System.out.println(" RESULTADO DO QUIZ");
        System.out.println("==================================================");
        System.out.println("Total de acertos: " + totalAcertos + " de " + quiz.length); //[cite: 1]
        System.out.printf("Média de acerto: %.2f%%\n", media); // Média formatada com 2 casas decimais[cite: 1]
        System.out.println("==================================================");
        System.out.println("Obrigado por jogar! Trabalho concluído com sucesso."); // Mensagem de agradecimento[cite: 1]
        System.out.println("==================================================");

        scanner.close();
    }
}
