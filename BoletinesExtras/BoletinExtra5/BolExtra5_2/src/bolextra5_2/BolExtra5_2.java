/*
A asociación de vinicultores ten como política fixar un prezo inicial ao quilo 
de uva, a cal se clasifica en tipos (A e B), e ademais en tamaños (1 e 2). Cando
se realiza a venda do produto, esta é dun só tipo e tamaño, requírese determinar
canto recibirá un produtor pola uva que entrega nun embarque considerando o 
seguinte:
 * Se é de tipo A, cárganselle 20 céntimos ao prezo inicial cando é de tamaño 1 
e 30 céntimos se é de tamaño 2.
 * Se é de tipo B, rebáixanse 30 céntimos cando é de tamaño 1, e 50 céntimos 
cando é de tamaño 2.
 */
package bolextra5_2;

public class BolExtra5_2 {

    public static void main(String[] args) {
       Vinicultores obj=new Vinicultores();
       
    obj.alquilerUva();
    }
}
