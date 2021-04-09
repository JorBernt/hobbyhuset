package webprog.pers.hobbyhuset.hobbyhuset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VareController {

    @Autowired
    AppRepository rep;

    @GetMapping("/hentVarer")
    public List<Vare> hentVarer() {
        return rep.hentVarer();
    }
}
