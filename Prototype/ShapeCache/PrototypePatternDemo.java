public class PrototypePatternDemo {
   public static void main(String[] args) {
      ShapeCache.loadCache();

      Shape clonedShape = (Shape) ShapeCache.getShape("Circle");
      System.out.println("Shape : " + clonedShape.getType());		
      clonedShape.draw();

      Shape clonedShape2 = (Shape) ShapeCache.getShape("Square");
      System.out.println("Shape : " + clonedShape2.getType());
      clonedShape2.draw();		

      Shape clonedShape3 = (Shape) ShapeCache.getShape("Rectangle");
      System.out.println("Shape : " + clonedShape3.getType());	
      clonedShape3.draw();	

      //Pippo p = (Pippo) register.get("Pippo");
      //Pluto p1 = (Pluto) register.get("Pluto");    

   }
}