public interface Strategy{
    public float media(float p1, float p2);
}

public class OperationAdd implements Strategy{
    @Override
    public float media(float p1, float p2){
        media = (p1 + p2) / 2;
        return media;
    public float mediaGeo(float p1, float p2){
        mediaGeo = Math.sqrt(p1*p2);
        return mediaGeo;
        }
    }
}

public class Strategy{
    public static void public static void main(String[] args) {
        OperationAdd ari = new OperationAdd();
        System.out.println("Media aritmetica: " + ari.media(p1, p2));
        System.out.println("Média Geometrica: " + ari.mediaGeo(p1,p2));
    }
}