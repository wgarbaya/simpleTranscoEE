package test.duke;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.duke.controller.TranscoController;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class TestTranscoController {

	TranscoController cut;
	
	@Before
	public void init(){
		this.cut = new TranscoController();
	}
	
	@Test
	public void dummy_test() {
		assertThat(cut.GetOneStringFromPredicate("r"),startsWith ("r"));
	}

}
