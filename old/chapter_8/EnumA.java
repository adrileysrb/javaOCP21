package chapter_8;

public enum EnumA {
    MSG_1("Mensagem 1"),
    MSG_2("Mensagem 2");

    String msg;

    private EnumA(String msg) {
        this.msg = msg;
    }
}
