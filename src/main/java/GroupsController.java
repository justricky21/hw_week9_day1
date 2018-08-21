import models.RandomGenerator;
import models.Student;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.SparkBase.staticFileLocation;
import static spark.Spark.get;

public class GroupsController {
    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        staticFileLocation("/public");

        RandomGenerator generator = new RandomGenerator();
        Student ricardo = new Student("Ricardo", "E23");
        Student bea = new Student("Beata","E23");
        Student digory = new Student("Diggy", "E23");
        Student emil = new Student("Emil", "E23");
        Student euan = new Student("Euan", "E23");
        Student gaz = new Student("Garry", "23");
        Student gemma = new Student("Gemma", "E23");
        Student joanna = new Student("Joanna", "E23");
        Student kirstin = new Student("Kirstin", "E23");
        Student marcin = new Student("Marcin", "E23");
        Student mark = new Student("Mark", "E23");
        Student melinda = new Student("Melinda", "E23");
        Student mike = new Student("Mike", "E23");
        Student molly = new Student("Molly", "E23");
        Student pat = new Student("Pat", "E23");
        Student raphael = new Student("Raphael", "E23");
        Student robbie = new Student("Robbie", "E23");
        Student stoo = new Student("Stoooooooo", "E23");
        Student tahnee = new Student("Tahnee", "E23");
        Student vicky = new Student("Vicky", "E23");
        generator.addStudent(ricardo);
        generator.addStudent(bea);
        generator.addStudent(digory);
        generator.addStudent(emil);
        generator.addStudent(euan);
        generator.addStudent(gaz);
        generator.addStudent(gemma);
        generator.addStudent(joanna);
        generator.addStudent(kirstin);
        generator.addStudent(marcin);
        generator.addStudent(mark);
        generator.addStudent(melinda);
        generator.addStudent(mike);
        generator.addStudent(molly);
        generator.addStudent(pat);
        generator.addStudent(raphael);
        generator.addStudent(robbie);
        generator.addStudent(stoo);
        generator.addStudent(tahnee);
        generator.addStudent(vicky);

        ArrayList<Student> pairs = new ArrayList<Student>();
        generator.transferPair(pairs);

        get("/random", (req, res) ->{

            HashMap<String, Object> model = new HashMap<>();
            model.put("cohort", pairs.get(0).getCohort());
            model.put("pair1", pairs.get(0).getName());
            model.put("pair2", pairs.get(1).getName());
            model.put("template", "random.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


    }
}
