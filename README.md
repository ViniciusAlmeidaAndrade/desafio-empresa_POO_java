# 🧑‍💼 Sistema de Funcionários em Java (POO)

## 📌 Descrição

Este projeto é uma implementação simples de um sistema de funcionários utilizando **Programação Orientada a Objetos (POO)** em Java.

O sistema simula diferentes tipos de funcionários de uma empresa e calcula seus salários com base em regras específicas para cada cargo.

---

## 🎯 Objetivo

Aplicar na prática os principais conceitos de POO:

* Encapsulamento
* Herança
* Polimorfismo
* Sobrescrita de métodos (`@Override`)

---

## 🏗️ Estrutura do Projeto

O sistema possui três tipos de funcionários:

### 👤 Funcionario

Classe base que contém:

* `nome`
* `salarioBase`

Método:

* `calcularSalario()` → retorna o salário base

---

### 👨‍💼 Gerente (extends Funcionario)

Atributo adicional:

* `bonus`

Regra:

```
salarioFinal = salarioBase + bonus
```

---

### 👨‍💻 Desenvolvedor (extends Funcionario)

Atributos adicionais:

* `horasExtras`
* `valorHoraExtra`

Regra:

```
salarioFinal = salarioBase + (horasExtras * valorHoraExtra)
```

---

## ▶️ Como Rodar o Projeto
---

### 📥 Clonar o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

---

### 📂 Acessar a pasta do projeto

```bash
cd seu-repositorio
```

---

### ⚙️ Compilar os arquivos

Se estiver usando terminal:

```bash
javac *.java
```

---

### ▶️ Executar o programa

```bash
java Main
```

---

---

### 💡 Dica

Se estiver usando VS Code:

1. Abra a pasta do projeto
2. Clique com o botão direito no arquivo `App.java`
3. Clique em **Run Java**

---

## 🖥️ Saída Esperada

```
Funcionário: João
Salário Final: 2000.0

Funcionário: Maria
Salário Final: 5500.0

Funcionário: Carlos
Salário Final: 3500.0
```

---

## 🧠 Conceitos Aplicados

### 🔒 Encapsulamento

* Atributos privados
* Uso de getters e setters

### 🧬 Herança

* `Gerente` e `Desenvolvedor` herdam de `Funcionario`

### 🔁 Polimorfismo

* Sobrescrita do método `calcularSalario()`

---
