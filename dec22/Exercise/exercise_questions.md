### Exercise 1: Basic Class Creation
**Objective**: Create a simple `Book` class with attributes like `title`, `author`, and `ISBN`. Then, write a `Library` class that contains a list of `Book` objects.

**Tasks**:
1. Define the `Book` class with private attributes and public getters and setters.
2. Create the `Library` class with a method to add `Book` objects to its list.
3. Write a main method where you create several `Book` objects and add them to a `Library` instance.

### Exercise 2: Dependency Injection with Constructor
**Objective**: Understand constructor-based dependency injection.

**Scenario**: Create a `Light` class and a `Switch` class. The `Switch` should control the `Light`.

**Tasks**:
1. Define the `Light` class with a method to turn on and off.
2. Create the `Switch` class which requires a `Light` object in its constructor.
3. In the main method, instantiate a `Light` object and inject it into a `Switch` object.

### Exercise 3: Dependency Injection with Setter Method
**Objective**: Practice setter-based dependency injection.

**Scenario**: Develop a `MusicPlayer` class and a `Playlist` class. The `MusicPlayer` depends on a `Playlist`.

**Tasks**:
1. Define the `Playlist` class with a list of songs.
2. Create the `MusicPlayer` class with a setter method to set the `Playlist`.
3. In the main method, create a `Playlist` object, set it in a `MusicPlayer` object, and demonstrate playing music.

### Exercise 4: Interface-based Dependency Injection
**Objective**: Implement dependency injection using interfaces for loose coupling.

**Scenario**: Create a `PaymentProcessor` interface and two implementations: `CreditCardProcessor` and `PaypalProcessor`. Use these in a `CheckoutService`.

**Tasks**:
1. Define the `PaymentProcessor` interface with a `processPayment` method.
2. Implement the interface in `CreditCardProcessor` and `PaypalProcessor`.
3. In the `CheckoutService` class, use a `PaymentProcessor` type for payment processing.
4. Demonstrate in the main method how a `CheckoutService` can use either payment processor.

### Exercise 5: Spring Framework Dependency Injection
**Objective**: Use Spring Framework for dependency injection.

**Scenario**: Create a simple Spring application with a `CustomerService` class that depends on a `CustomerRepository` class.

**Tasks**:
1. Set up a Spring project (use Spring Initializr or similar tools).
2. Create the `CustomerRepository` class and annotate it with `@Repository`.
3. Develop the `CustomerService` class with a `CustomerRepository` dependency and annotate it with `@Service`.
4. Use `@Autowired` in `CustomerService` to inject the `CustomerRepository`.
5. Write a main class annotated with `@SpringBootApplication` and use `ApplicationContext` to get a `CustomerService` bean and call its methods.

---