package colecoes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;
import javax.print.attribute.standard.JobHoldUntil;
import javax.sound.midi.Track;
// comparable define o metodo de comparação padrão
class trackz implements Comparable<trackz>{
    private String titulo;
    private int avaliacao;
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public trackz(String titulo, int avaliacao){
        this.titulo = titulo;
        this.avaliacao = avaliacao;
    }
    public trackz(String titulo){
        this.titulo = titulo;
    }
    public String toString(){
        return String.format("Titulo %s, Avaliação %d",titulo, avaliacao);
    }
    @Override
    // o metodo compareTo retorna o metodo compareTo de strings que irá ordenar por nome\titulo
    public int compareTo(trackz o) {
        // se trackz this for menor, então devolvemos -1
        // se a this for = 0, devolvemos 0
        // senão devolve 1
        return this.titulo.compareTo(o.titulo);
    }
    @Override
    public boolean equals(Object obj){
        var outra = (trackz)obj;
        return this.titulo.equals(outra.titulo);
    }
}

class AvaliaçaoComparator implements Comparator<trackz>{
    @Override
    public int compare (Track t1, Track t2){
        if(t1.getavaliacao() > t2.getavaliacao){
            return -1;}
        if(t1.getavaliacao() == t2.getavaliacao){
            return t1.compareTo(t2);}
        return 1;
    }
}

public class MyTrackz {
    public static void main(String[] args) {
        var minhasTrackz = new ArrayList<trackz>();
        var menu = "1-cadastrar\n2-remover\n3-atualizar\n4-listar ordenado por nome\n5-listar ordenado por avaliacao\n6-avaliar\n0-sair\n";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
                // utiliza-e o {} no case pois a variavel titulo está sendo declarada 2 ou + vezes no codigo
                case 1:{
                    var titulo = JOptionPane.showInputDialog("titulo: ");
                    var trackz = new trackz(titulo);
                    minhasTrackz.add(trackz);
                    JOptionPane.showMessageDialog(null, "Track adicionada");
                    break;
                }
                case 2:{
                    var titulo = JOptionPane.showInputDialog("titulo: ");
                    var trackz = new trackz(titulo);
                    
                    if(minhasTrackz.contains((trackz))){
                        minhasTrackz.remove(trackz);
                        JOptionPane.showMessageDialog(null, "Musica removida");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Musica não encontrada!");
                    }
                    break;
                }
                case 3:{
                    var titulo = JOptionPane.showInputDialog("Titulo: ");
                    var trackz = new trackz(titulo);
                    var indice = minhasTrackz.indexOf(trackz);
                    if(indice >= 0){
                        var novoTitulo = JOptionPane.showInputDialog(null, "Novo titulo: ");
                        minhasTrackz.get(indice).setTitulo(novoTitulo);
                        JOptionPane.showMessageDialog(null, "Musica atualizada");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Musica não encontrada");
                    }

                        break;
                    }
                case 4:{
                    if(minhasTrackz.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Lista vazia");
                    }
                    else{
                        // o sort por padrão chama o compareTO que ordena por string
                        Collections.sort(minhasTrackz);
                        JOptionPane.showMessageDialog(null, minhasTrackz);
                    }
                    break;
                }
                case 5:{
                    if(minhasTrackz.isEmpty()){
                        JOptionPane.showMessageDialog(null, "lista vazia");
                    }
                    else{
                        Collections.sort(minhasTrackz, new AvaliaçaoComparator());
                    }
                    break;
                }
                case 6:{
                    var titulo = JOptionPane.showInputDialog("titulo?");
                    var trackz = new trackz(titulo);
                    var indice = minhasTrackz.indexOf(trackz);
                    if(indice != -1){
                        var avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Avaliação?"));
                        minhasTrackz.get(indice).setAvaliacao(avaliacao);
                        JOptionPane.showMessageDialog(null, "Musica avaliada");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Musica não encontrada");
                    }
                    break;
                }
                case 0:{
                    JOptionPane.showMessageDialog(null, "Até logo");
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida");
                    break;

            }

        }while(op != 0);
    }
}
