# PRÉ REQUISITOS
ubuntu, vscode, python, pip, antlr

# TUTORIAL

Criar ambiente virtual
virtualenv venv

Ativar ambiente virtual
source venv/bin/activate

Instalar requisitos do ambiente virtual
pip install -r requirements.txt

Compilar em python
python -m cmm -h, `não esta funcionando, use o comando abaixo`

python3 -m cmm input.cmm

Testar arquivo.cmm
python -m cmm input.cmm
python -m cmm zetta.cmm4

# Exemplo do Evandro

https://gitlab.com/evandro-crr/cmm/-/tree/lambda

# Setup 

Install Python packages
```shell
pip install -r requirement.txt
```

> ANTLR requirers java to generate the parser.

# Usage

```shell
$ python -m cmm -h
usage: cmm [-h] [-o] input

C-- interpreter

positional arguments:
input      source code

optional arguments:
-h, --help  show this help message and exit
-o          python output
```
