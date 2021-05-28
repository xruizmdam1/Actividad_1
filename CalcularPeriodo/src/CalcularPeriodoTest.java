import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

class CalcularPeriodoTest {

	@SuppressWarnings("static-access")
	@Test
	public void test() {
		CalcularPeriodo cp = new CalcularPeriodo();
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);
		cp.calcularPeriodo("Pepe", fecha);
	}
}