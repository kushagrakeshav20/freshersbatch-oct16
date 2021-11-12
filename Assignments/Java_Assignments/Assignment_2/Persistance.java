 
 abstract  class Persistance {
	 abstract void persist();

}

class FilePersistence extends Persistance{

    @Override
    void persist() {
        System.out.println("In FilePersistence");

    }
}

class DataPersistence extends Persistance{

    @Override
    void persist() {
        System.out.println("In DataPersistece");
    }
}

class abstractclass {
    public static void main(String[] args) {
        Persistance p = new FilePersistence();
        p.persist();
        Persistance p2 = new DataPersistence();
        p2.persist();
    }
}