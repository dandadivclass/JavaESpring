package GerenciamentoTarefas;

public class GerenciadorDeTarefas {

    private static Tarefa[] tarefas = new Tarefa[10];
    private static int contador = 0;

    public static void adicionarTarefa(String nome, String descricao, Prioridade prioridade){
        if (contador < tarefas.length) {
            tarefas[contador++] = new Tarefa(nome, descricao, prioridade);
        }else {
            System.out.println("Limite de tarefas excedido");
        }
    }

    /*
    public static void listarTarefas() {
        Arrays.sort(tarefas, 0, contador, Comparator.comparing(Tarefa::getPrioridade));
        for (int i = 0; i < contador; i++) {
            System.out.println(tarefas[i]);
        }
    }
    */

    public static void listar() {
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
    }

    public static void listarComStringBuilder() {
        StringBuilder sb = new StringBuilder();
        int index = 1;
        for (Tarefa t : tarefas) {
            if (t != null) {
                sb.append(String.format("Tarefa %d:\n", index++));
                sb.append(String.format("Nome: %s\n", t.getNome()));
                sb.append(String.format("Descrição: %s\n", t.getDescricao()));
                sb.append(String.format("Prioridade: %s\n\n", t.getPrioridade()));
            }
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) {
        adicionarTarefa("Estudar Java", "Arrays", Prioridade.ALTA);
        adicionarTarefa("Estudar Java", "Strings", Prioridade.MEDIA);
        adicionarTarefa("Estudar Java", "Fazer e entender exercícios diariamente", Prioridade.ALTA);
        adicionarTarefa("Estudar Java", "Associação", Prioridade.BAIXA);
        adicionarTarefa("Estudar Java", "Herança", Prioridade.ALTA);
        adicionarTarefa("Estudar Java", "Listas", Prioridade.MEDIA);
        adicionarTarefa("Estudar Java", "Polimorfismo", Prioridade.ALTA);
        adicionarTarefa("Estudar Java", "Fazer e entender exercícios diariamente", Prioridade.ALTA);
        adicionarTarefa("Estudar Java", "Fazer e entender exercícios diariamente", Prioridade.MEDIA);
        adicionarTarefa("Estudar Java", "Fazer e entender exercícios diariamente", Prioridade.BAIXA);

        listarComStringBuilder();

    }


}
