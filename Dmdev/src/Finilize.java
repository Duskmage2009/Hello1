public class Finilize {
    public static void main(String[] args) throws Throwable {
        Cat cat = new Cat("Jony");
        cat.setName(cat.getName()+ "k");

        Cat cat1 = new Cat("Simon");
        cat1.finalize();
    }
}
    class Cat{
        String name;

        public Cat(String name){
            this.name = name;
        }
        @Override
        protected void finalize() throws Throwable{
            System.out.println("Обьект удалён");
        }

        public String getName(){
            return name;
        }

    public void setName(String name){
            this.name = name;
    }
    }

