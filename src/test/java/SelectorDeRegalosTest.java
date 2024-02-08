import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectorDeRegalosTest {
    @Test
    @DisplayName("Juguete de construcción test")
    public void regaloJuguete(){
        String r1 = SelectorDeRegalos.seleccionarRegalo(101,8);
        assertEquals("Juguete de construcción",r1);
    }
    @Test
    @DisplayName("Libro de aventuras test")
    public void regaloJugueteJoven(){
        String r2 = SelectorDeRegalos.seleccionarRegalo(80,15);
        assertEquals("Libro de aventuras",r2);
    }

}