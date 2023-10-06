package bolextra3_2;

public class ExcepcionNegativo extends Exception {

    private static final long serialVersionUID = 1L;

    public ExcepcionNegativo(){
        super();
    }
    public ExcepcionNegativo(String msg){
        super(msg);
    }
}
