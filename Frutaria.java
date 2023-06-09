/**
 * Classe que simboliza as empresas do tipo frutaria
 */
public class Frutaria extends Mercearia {

    /**
     * O número de produtos para venda na frutaria
     */
    private int numeroProdutos;

    /**
     * O valor médio de faturação anual por produto
     */
    private float faturacaoMediaAnualProduto;

    /**
     *  Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param custoAnualLimpeza O custo anual de limpeza da mercearia
     * @param numeroProdutos O número de produtos para venda na frutaria
     * @param faturacaoMediaAnualProduto O valor médio de faturação anual por produto
     */
    public Frutaria(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza, int numeroProdutos, float faturacaoMediaAnualProduto) {
        super(nome, distrito, coordenadas, custoAnualLimpeza);
        this.numeroProdutos = numeroProdutos;
        this.faturacaoMediaAnualProduto = faturacaoMediaAnualProduto;
        this.setCategoriaEmpresa(4);
    }

    // Métodos

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public float calcularReceitaAnual() {
        return numeroProdutos * faturacaoMediaAnualProduto;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    public float calcularDespesaAnual() {
        return getCustoAnualLimpeza();
    }

    // Getters and Setters e Overrides

    /**
     * Métodos de acesso externo ao número de produtos para venda na frutaria
     * @return o número de produtos para venda na frutaria
     */
    public int getNumeroProdutos() {
        return numeroProdutos;
    }

    /**
     * Método para definir o número de produtos para venda na frutaria
     * @param numeroProdutos o número de produtos para venda na frutaria
     */
    public void setNumeroProdutos(int numeroProdutos) {
        this.numeroProdutos = numeroProdutos;
    }

    /**
     * Métodos de acesso externo ao valor médio de faturação anual por produto
     * @return o valor médio de faturação anual por produto
     */
    public float getFaturacaoMediaAnualProduto() {
        return faturacaoMediaAnualProduto;
    }

    /**
     * Método para definir o valor médio de faturação anual por produto
     * @param faturacaoMediaAnualProduto o valor médio de faturação anual por produto
     */
    public void setFaturacaoMediaAnualProduto(float faturacaoMediaAnualProduto) {
        this.faturacaoMediaAnualProduto = faturacaoMediaAnualProduto;
    }
    /**
     * Método para apresentar todos os atributos de um determinado objeto
     * @return Uma ‘string’ que contém todos os atributos de um determinado objeto
     */
    @Override
    public String toString(){
        String s=
                "Tipo                  :\t"+"Frutaria"+
                "\nNome                :\t"+this.getNome()+
                "\nDistrito            :\t"+this.getDistrito()+
                "\nDespesa Anual       :\t"+calcularDespesaAnual()+
                "\nReceita Anual       :\t"+calcularReceitaAnual()+
                "\nLucro               :\t";
        float lucro= this.calcularLucro();
        if (lucro>0){
            s+="Sim";
        }
        else{
            s+="Não";
        }
        return s;
    }
}
