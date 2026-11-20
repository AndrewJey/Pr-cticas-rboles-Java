public class TreeCheck {
 public static void main(String[] args) throws Exception {

 Logic.ArbolBinario tree=new Logic.ArbolBinario();CheckSupport.equal(tree.buscar(3),null);
 for(int n:new int[]{5,2,9,1,4,7,10})tree.insertarArbol(n,"V"+n);
 CheckSupport.equal(tree.buscar(7).valor,"V7");CheckSupport.equal(tree.buscar(40),null);
 CheckSupport.check(tree.raiz.hijoIzquierdo.padre==tree.raiz,"Parent link");
 practicaarboles.Principal.main(new String[]{"3","1","2"});

 CheckSupport.done();
 }
}
