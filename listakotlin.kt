var lista: MutableList<String> = mutableListOf()


fun adicionarItem(){
    println("Digite o item a ser adicionado:")
    val item = readln()
    lista.add(item)
    println("Item adicionado: $item")
}


fun ListarItens(){
    if (lista.isEmpty()) {
        println("A lista está vazia.")
    } else {
        println("Itens na lista:")
        lista.forEachIndexed { index, item ->
            println("${index + 1}. $item")
        }
    }
}
    
fun removerItem(){
    if (lista.isEmpty()) {
        println("A lista está vazia. Não há itens para remover.")
        return
    }
    
    println("Digite o número do item a ser removido:")
    ListarItens()  // Mostra os itens atuais
    val index = readln().toIntOrNull()
    
    if (index != null && index in 1..lista.size) {
        val removedItem = lista.removeAt(index - 1)
        println("Item removido: $removedItem")
    } else {
        println("Número inválido.")
    }
}

fun showMenu(){
    while (true){
        println("Menu:")
        println("1. adicionar item:")
        println("2. Listar itens")
        println("3. Excluir itens")
        println("0. Sair")
        print("Opçao:")
        var opcao = readln()
        when(opcao){
            "1" -> adicionarItem()
            "2" -> ListarItens()
            "3" -> removerItem()
           "0" -> break 
            else -> println("opcao invalida!")
        }    
    }    
}

fun main(){
    showMenu()
}        