public class Developer {
    private String name;
    private String level;
    private String experience;
    public Developer(String name, String level, String experience){
        this.name = name;
        this.level = level;
        this.experience = experience;
    }
    public void workProject(){
        System.out.println("Разработчик работает над проектом!");
    }
}
