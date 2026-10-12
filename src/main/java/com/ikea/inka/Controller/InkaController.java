@RestController
@RequestMapping("/api")
public class HelloController {
@RequestMapping("/product/{id}")
  public String getProductById(@PathVariable("id") int productId) {
        return "Product ID: " + productId;
}

  @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@RequestBody Person person) {
    
  }
}
