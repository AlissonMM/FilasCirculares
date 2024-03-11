public class FilaCircular {
    int[] dados;
    public int inicio, fim, tamanho, capacidade;

    public FilaCircular(int c){
        inicio = 0; //Onde comeca a fila
        fim = 0; // a Posicao onde sera inserido o valor
        tamanho = 0; // o tanto de dados de uma fila
        capacidade = c; // tamanho da fila

        dados = new int[capacidade];


    }

    public boolean isFull(){
        return tamanho == capacidade;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public void add(int d){
        if (isFull()){
            System.out.println("Está cheia");
        } else {
            dados[fim] = d;
            tamanho++;
            fim = (fim + 1) % capacidade; //Se chegar no fim da lista, volta ao inicio
        }

    }
    public void remove(){
        if (isEmpty()){
            System.out.println("Está Vazia");
        } else {
            inicio = (inicio + 1) % capacidade;
            tamanho--;
        }

    }

    public void print(){
        System.out.print("\n [");
        for (int i = 0; i < tamanho; i++){
            System.out.print("" + dados[(inicio + i)%capacidade]);
        }
        System.out.println("]");
    }
}
