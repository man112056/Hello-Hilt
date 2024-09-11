# Hilt Dependency Injection Sample

This project demonstrates the usage of Hilt for dependency injection in three different scenarios:
1. **Direct Injection using `@Inject` Constructor** (Folder: `simple`)
2. **Binding Interfaces with Hilt Modules** (Folder: `bind`)
3. **Providing Dependencies with Hilt Modules** (Folder: `provides`)

## Folder Structure
- **`simple/`**: Demonstrates direct injection using the `@Inject` constructor.
- **`bind/`**: Demonstrates how to use `@Binds` in a Hilt module for interface injection.
- **`provides/`**: Demonstrates how to use `@Provides` in a Hilt module for complex dependency provision.

---

## 1. Direct Injection with `@Inject` Constructor (Simple)
When your dependencies can be provided through the constructor, you don't need to define a module. Hilt can automatically handle the creation of objects.

**Example:**
```kotlin
class ApiService @Inject constructor() {
    fun fetchData(): String = "Data from API"
}

class Repository @Inject constructor(
    private val apiService: ApiService
) {
    fun getData(): String = apiService.fetchData()
}
