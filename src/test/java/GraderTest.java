import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
  @Test
    void fiftyNineShouldReturnF(){
      var garder =new Grader();
      assertEquals('F',garder.determinedlyGrade(60));
  }
}