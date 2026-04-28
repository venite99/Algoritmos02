package Exercicios;

public class TriagemHospitalar {

    static class Paciente {
        String nome;
        int gravidade;
        int tempoEspera;

        Paciente(String nome, int gravidade, int tempoEspera) {
            this.nome = nome;
            this.gravidade = gravidade;
            this.tempoEspera = tempoEspera;
        }
    }

    public static boolean temMaisPrioridade(Paciente a, Paciente b) {
        if (b.gravidade > a.gravidade) return true;
        if (b.gravidade == a.gravidade && b.tempoEspera > a.tempoEspera) return true;
        return false;
    }

    public static void selectionSortPacientes(Paciente[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                if (temMaisPrioridade(vetor[menor], vetor[j])) {
                    menor = j;
                }
            }
            Paciente temp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = temp;
        }
    }

    public static void main(String[] args) {
        Paciente[] pacientes = {
            new Paciente("João",  3,  5),
            new Paciente("Maria", 3, 10),
            new Paciente("Lucas", 5,  2)
        };

        System.out.println("Entrada:");
        for (Paciente p : pacientes)
            System.out.println("  " + p.nome + " | gravidade=" + p.gravidade + " | espera=" + p.tempoEspera + "min");

        selectionSortPacientes(pacientes);

        System.out.print("\nOrdem de atendimento: ");
        for (int i = 0; i < pacientes.length; i++) {
            System.out.print(pacientes[i].nome);
            if (i < pacientes.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}