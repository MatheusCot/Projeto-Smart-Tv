public class App {
    public static void main(String[] args) throws Exception {
      
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal atual : " +smartTv.canal);
        System.out.println("Volume atual : " +smartTv.volume);

        smarTv.ligar ();
        System.out.println("Novo Statu -> TV Ligada?" +smartTv.ligada);
}
