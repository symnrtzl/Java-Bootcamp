package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands") //nasıl ulaşacağı -->trayıcıda adresleme  www.kodlama.io/api/brands
public class BrandsController {

    private BrandService brandService;

    @Autowired // Parametrelere bak - BrandService, uygulamayı tara, BrandsServiceyi kim implemente ediyor BrandManager, Onun new'lenmiş halini ver
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall") // www.kodlama.io/api/brands/getAll yazılınca burası çalışacak
    public List<GetAllBrandsResponse> getAll() {

        return brandService.getAll();
    }


    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }
}
