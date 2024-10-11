public class AlgoHandler {
    public Algorithm algorithm;

    public void setAlgorithm(Algorithm _algorithm){
        algorithm = _algorithm;
    }

    public String encrypt(String message){
        return algorithm.encrypt(message);
    }

    public String decrypt(String message){
        return algorithm.decrypt(message);
    }
}
