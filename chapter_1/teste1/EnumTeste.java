package teste1;

public enum EnumTeste {
    SEGUNDA("Segunda-feira", 1) {
        {
            System.out.println("qqqqqqqqqqqqqqqqqq0");
        }
        @Override
        public String teste() {
            return "asdafadfa";
        }

        @Override
        public String getDescricao() {
            return "llllll";
        }

        public void foo() {
            System.out.println("foo segunda");
        }
    },

    TERÇA("Terça-feira", 2) {

        public void foo() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'foo'");
        }

        @Override
        public String teste() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'teste'");
        }

    };

    {
        System.out.println("dafafdafas");
        teste = "";
    }

    public String teste = "Stesfasdfadf";
    public static String descricao;
    private Integer codigo;

    private EnumTeste(String descricaoa, Integer codigo) {
        this.codigo = codigo;
        System.out.println("oooooooooooooo");
    }

    public String getDescricao() {
        return descricao + " - From Method";
    }
    public String getDescricao1231t() {
        return teste + " - From Method";
    }

    public abstract String teste();

    public static void main(String... args){
        System.out.println(TERÇA);
    }

}
