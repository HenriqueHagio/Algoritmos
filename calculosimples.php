<form method="post" action="seuscript.php">
    <label for="codigo1">Código da peça:</label>
    <input type="text" name="codigo1" id="codigo1" placeholder="Código da peça">
    <label for="peca1">Número de peças:</label>
    <input type="text" name="peca1" id="peca1" placeholder="Número de peças">
    <label for="valor1">Valor unitário:</label>
    <input type="text" name="valor1" id="valor1" placeholder="Valor unitário">
    <label for="codigo2">Código da peça:</label>
    <input type="text" name="codigo2" id="codigo2" placeholder="Código da peça">
    <label for="peca2">Número de peças:</label>
    <input type="text" name="peca2" id="peca2" placeholder="Número de peças">
    <label for="valor2">Valor unitário:</label>
    <input type="text" name="valor2" id="valor2" placeholder="Valor unitário">
    <input type="submit" value="Calcular">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $codigo1 = $_POST["codigo1"];
    $peca1 = $_POST["peca1"];
    $valor1 = $_POST["valor1"];
    $codigo2 = $_POST["codigo2"];
    $peca2 = $_POST["peca2"];
    $valor2 = $_POST["valor2"];

    $valortotal = ($peca1 * $valor1) + ($peca2 * $valor2);
    echo "VALOR A PAGAR: R$ " . $valortotal;
}
?>
