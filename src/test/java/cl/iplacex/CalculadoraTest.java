package cl.iplacex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
        void probarSuma() {
                Calculadora calculadora = new Calculadora();
                        assertEquals(8, calculadora.sumar(5, 3));
                            }

                                @Test
                                    void probarResta() {
                                            Calculadora calculadora = new Calculadora();
                                                    assertEquals(5, calculadora.restar(9, 4));
                                                        }
                                                        }