# Ejercicio 8: MangaVolume

## 🧠 Explicación Lógica
1. **Método Auxiliar Privado:** `esTomoExtenso()` actúa como un helper de uso interno dentro de la clase para evaluar si las páginas superan las 300.
2. **Delegación de Responsabilidad:** El método público `esEdicionEspecial()` delega su resultado al método privado `esTomoExtenso()`.
3. **Sobrescritura de `toString()`:** Se anuló el método `toString()` predeterminado de `Object` para ofrecer una representación textual limpia y formal cuando un objeto se pase a `System.out.println()`.