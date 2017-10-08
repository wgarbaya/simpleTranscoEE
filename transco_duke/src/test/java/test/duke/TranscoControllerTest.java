package test.duke;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.duke.controller.TranscoController;

public class TranscoControllerTest {

	private final TranscoController cut;
	public TranscoControllerTest(){
		this.cut = new TranscoController();
	}
	
	@Test
	@DisplayName("Dummy test to be replaced")
	public void resultShouldStartWithSame() {
		assertTrue(cut.GetOneStringFromPredicate("r").startsWith ("r"));
	}

}
