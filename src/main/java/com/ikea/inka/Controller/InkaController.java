@RestController
@RequestMapping("/api")
public class HelloController {
@RequestMapping("/product/{id}")
  public String getProductById(@PathVariable("id") int productId) {
        return "Product ID: " + productId;
}

  @PostMapping(path ="/product/{ownerId}/create", consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@PathVariable Long ownerId,@RequestBody Prodct product) {
    
  }
}
