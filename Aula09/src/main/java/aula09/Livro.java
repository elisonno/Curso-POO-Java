package aula09;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "------DETALHES DO LIVRO--------" + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Total de Paginas: " + totPaginas + "\n" +
                "Livro está: " + (aberto?"Aberto":"Fechado") + "\n" +
                "Pagina Atual: " + pagAtual + "\n" +
                leitor + "\n" +
                "-------------------------------";
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 1;
        this.leitor = leitor;
        this.aberto = false;
    }

    public Livro(Pessoa pessoa) {
        this.leitor = pessoa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPagAtual(1);
    }

    @Override
    public void folhear(int pagina) {
        if(this.getAberto() && pagina <= getTotPaginas())this.setPagAtual(pagina);
    }

    @Override
    public void avacarPag() {
        if(this.getAberto() && this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto() && this.getPagAtual() > 1 ){
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }
}
