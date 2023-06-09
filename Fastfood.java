/**
 * Classe que simboliza as empresas do tipo restaurante fast-food
 */
public class Fastfood extends Restaurante {

    /**
     * O número de mesas no interior
     */
    private int mesasInterior;

    /**
     * O valor de faturação média por mesa por dia
     */
    private float faturacaoMediaMesaDiario;

    /**
     * O número médio de clientes 'drive-thru' diário
     */
    private float clientesMedioDrive;

    /**
     * O valor médio de faturação por cliente de 'drive-thru' (diário)
     */
    private float faturacaoMediaClienteDrive;

    /**
     *  Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param empregadosMesa O número de empregados de mesa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param clientesMedioDiario O número médio de clientes diário
     * @param diasFuncionamento O número de dias de funcionamento
     * @param mesasInterior O número de mesas no interior
     * @param faturacaoMediaMesaDiario A faturação média por mesa
     * @param clientesMedioDrive O número médio de clientes 'drive-thru' diário
     * @param faturacaoMediaClienteDrive O valor médio de faturação por cliente de 'drive-thru' (diário)
     */
    public Fastfood(String nome, String distrito, float[] coordenadas, int empregadosMesa, float salarioMedioAnual, float clientesMedioDiario, int diasFuncionamento, int mesasInterior, float faturacaoMediaMesaDiario, float clientesMedioDrive, float faturacaoMediaClienteDrive) {
        super(nome, distrito, coordenadas, empregadosMesa, salarioMedioAnual, clientesMedioDiario, diasFuncionamento);
        this.mesasInterior = mesasInterior;
        this.faturacaoMediaMesaDiario = faturacaoMediaMesaDiario;
        this.clientesMedioDrive = clientesMedioDrive;
        this.faturacaoMediaClienteDrive = faturacaoMediaClienteDrive;
        this.setCategoriaEmpresa(2);
    }

    // Métodos

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public float calcularReceitaAnual() {
        return ((mesasInterior * faturacaoMediaMesaDiario) + (clientesMedioDrive * faturacaoMediaClienteDrive)) * getDiasFuncionamento();
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    public float calcularDespesaAnual() {
        return getEmpregadosMesa() * getSalarioMedioAnual();
    }

    // Getters and Setters e Overrides

    /**
     * Métodos de acesso externo ao número de mesas no interior
     * @return o número de mesas no interior
     */
    public int getMesasInterior() {
        return mesasInterior;
    }

    /**
     * Método para definir o número de mesas no interior
     * @param mesasInterior o número de mesas no interior
     */
    public void setMesasInterior(int mesasInterior) {
        this.mesasInterior = mesasInterior;
    }

    /**
     * Métodos de acesso externo à faturação média por mesa
     * @return a faturação média por mesa
     */
    public float getFaturacaoMediaMesaDiario() {
        return faturacaoMediaMesaDiario;
    }

    /**
     * Método para definir a faturação média por mesa
     * @param faturacaoMediaMesaDiario a faturação média por mesa
     */
    public void setFaturacaoMediaMesaDiario(float faturacaoMediaMesaDiario) {
        this.faturacaoMediaMesaDiario = faturacaoMediaMesaDiario;
    }

    /**
     * Métodos de acesso externo ao número médio de clientes 'drive-thru' diário
     * @return o número médio de clientes 'drive-thru' diário
     */
    public float getClientesMedioDrive() {
        return clientesMedioDrive;
    }

    /**
     * Método para definir o número médio de clientes 'drive-thru' diário
     * @param clientesMedioDrive o número médio de clientes 'drive-thru' diário
     */
    public void setClientesMedioDrive(float clientesMedioDrive) {
        this.clientesMedioDrive = clientesMedioDrive;
    }

    /**
     * Métodos de acesso externo ao valor médio de faturação por cliente de 'drive-thru' (diário)
     * @return o valor médio de faturação por cliente de 'drive-thru' (diário)
     */
    public float getFaturacaoMediaClienteDrive() {
        return faturacaoMediaClienteDrive;
    }

    /**
     * Método para definir o valor médio de faturação por cliente de 'drive-thru' (diário)
     * @param faturacaoMediaClienteDrive o valor médio de faturação por cliente de 'drive-thru' (diário)
     */
    public void setFaturacaoMediaClienteDrive(float faturacaoMediaClienteDrive) {
        this.faturacaoMediaClienteDrive = faturacaoMediaClienteDrive;
    }

    /**
     * Método para apresentar todos os atributos de um determinado objeto
     * @return Uma ‘string’ que contém todos os atributos de um determinado objeto
     */
    @Override
    public String toString(){
        String s=
                "Tipo                  :\t"+"Fastfood"+
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
