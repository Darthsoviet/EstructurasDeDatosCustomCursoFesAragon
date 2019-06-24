/**
 *Facultad de Estudios Superiores Aragon
 *Ingenieria en Computacion
 *Estructuras de Datos - 2019-1
 *Del villar Lujan Ivan Andres Alexis
 *Fecha:
 * */
package edd.noLineales.grafo;

/**
 *
 * @author Admin
 */
public class GrafoMatriz {
    
    public static int MAX_VERTICES=20;
    public static int INFINITO=1000000;
    
    private int numVerts;
    
    private Vertice[] verts;
    private int[][] matAd;
    
    public GrafoMatriz(){
        this(MAX_VERTICES);
    }
    
    /**
     * 
     * @param tot tamaño de la matriz
     */
    
    public GrafoMatriz(int tot){
        this.matAd=new int [tot][tot];
        verts =new Vertice[tot];
        
        for(int i=0;i<tot;i++){
            for(int j=0;j<tot;j++){
                this.matAd[i][j]=0;
            }
        }
        this.numVerts=0;
    }
    
    /**
     * inicia la matriz con todos los pesos
     * en INFINITO
     */
    
    public  void inicializaMatrizPesos(){
        for(int i=0;i<numVerts;i++){
            for(int j=0;j<numVerts;j++){
                this.matAd[i][j]=INFINITO;
            }
        }
    }
    
    /**
     * 
     * @return la matriz de adyacencia
     */
    
    public int[][] getMatriz(){
        return this.matAd;
    }
    
    /**
     * crea un vertice. verifica que no este en el vector
     * @param nom nombre del vertice
     */
    
    public void nuevoVertice(String nom){
        boolean esta = numVertice(nom)>=0;
        if(!esta){
            Vertice v=new Vertice(nom);
            verts[numVerts++]=v;
            
        }
    }
    
    /**
     * buesca el nuevo vertice en el vector a
     * paritir del nombre
     * @param nom nombre del vertice
     * @return -1 si no lo encuentra. En otro caso retorna el numero del vertice
     */
    
    private int numVertice(String nom){
        int i =0;
        while(i<numVerts){
            if (verts[i].getNombre().equals(nom)){
                return i;
                
            }
            i++;
           
        }
         return -1;
    }
    
    /**
     * 
     * @param v posicion del vertice
     * @return nombre del vertice
     */
    
    public String nombreVertice(int v){
        return verts[v].getNombre();
    }
    
    /**
     * crea un nuevo arco o nueva arista recive 
     * busca el nombre vertice asignado acada uno de ellos
     * @param a
     * @param b 
     * @throws Exception si <code>a</code> o <code>b</code>
     */
    
    public void nuevoArco(String a,String b) throws Exception{
        int va, vb;
        va=numVertice(a);
        vb=numVertice(b);
        
        if(va<0 || vb<0){
            throw new Exception("Algunos de los vertices no existen");
        }else{
            matAd[va][vb]=1;
        }
    }
    
    public void nuevoArco(String a,String b,int peso) throws Exception{
        int va, vb;
        va=numVertice(a);
        vb=numVertice(b);
        
        if(va<0 || vb <0){
            throw new Exception("Algunos de los vertices no existen");
        }else{
            matAd[va][vb]=peso;
        }
        
    }
    /**
     * determina dos vertices forman un arco; es decir si el elemento 
     * de la matriz es de adyacencia 1
     * @param a
     * @param b
     * @return <code> true </code> si es adyacente.En otro caso <code>b</code>
     * @throws Exception 
     */
    
    public boolean adyacente(String a, String b) throws Exception{
         int va, vb;
        va=numVertice(a);
        vb=numVertice(b);
        
        if(va<=0 || vb <0){
            throw new Exception("Algunos de los vertices no existen");
        }else{
         return   matAd[va][vb]==1;
        }
        
    }
    
     /**
     * determina dos vertices forman un arco; es decir si el elemento 
     * de la matriz es de adyacencia 1
     * @param a
     * @param b
     * @return <code> true </code> si es adyacente.En otro caso <code>b</code>
     * @throws Exception 
     */
    
     public boolean adyacente(int a, int b) throws Exception{
        
        if(a<=0 || b <0){
            throw new Exception("Algunos de los vertices no existen");
        }else{
         return   matAd[a][b]==1;
        }
        
    }
     
     public String imprimirMatriz(){
         String res="";
         
         for(int i=0;i<numVerts;i++){
             for(int j=0;j<numVerts;j++){
                 res=res +matAd[i][j]+ " ";
             }
             res=res +"\n";
         }
         return res;
     }
     
     public String imprimirVertices(){
         String res="";
         for(int i =0;i<numVerts;i++){
             res=res+verts[i].getNombre()+" ";
         }
         return res;
     }
     
     /**
      * devuelve el total de vertices en el arco
      * @return total de vertices 
      */
     
     public int numeroDeVertices(){
         
         return numVerts;
     }
     
     /**
      * borra el arco
      * @param a
      * @param b
      * @throws Exception 
      */
     
     public void borrarArco(String a,String b) throws Exception{
        int va, vb;
        va=numVertice(a);
        vb=numVertice(b);
        
        if(va<=0 || vb <0){
            throw new Exception("Algunos de los vertices no existen");
        }else{
            matAd[va][vb]=0;
        }
    }
     
     public void borrarVertice(String nom) throws Exception{
         int va;
         va=numVertice(nom);
         
         if(va<0){
             throw new Exception("el vertice no existe");
         }else{
             Vertice vertAux[] = new Vertice[numVerts-1];
             int iAux=0;
             
             for(int i =0;i<numVerts;i++){
                 if(i!=va){
                     vertAux[iAux]=verts[i];
                     iAux++;
                 }
             }
             int matAdyAux[][]=new int[numVerts-1][numVerts-1];
             int jAux=0;
             iAux=0;
             
             for(int i=0;i<numVerts;i++){
                 if(i!=va){
                     jAux=0;
                     for(int j=0;j<numVerts;j++){
                         if(j!=va){
                             matAdyAux[iAux][jAux]=matAd[i][j];
                             jAux++;
                         }
                     }
                 
                 iAux++;
             }
         }
         this.verts=vertAux;
         this.matAd=matAdyAux;
     }
}



}
