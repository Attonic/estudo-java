package edu.cleison.repeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Thayane", "Cleison", "Yugi", "Zé"};

        for (int i = 0; i < alunos.length; i++){

            System.out.println("O aluno no indice i: " + i+"ª é: " + alunos[i] );
        }

        for(String aluno : alunos){
//            if (alunos[i] == "Zé") {
//                break;
//            }
            System.out.println("Nome do aluno é: " + aluno);

        }
    }
}
