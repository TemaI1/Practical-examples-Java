* Создать два файла, а затем объединить их, дав ему новое имя, просмотреть содержимое созданного файла.

>**cat > Pets** создал и заполнил файл Pets

>**cat > Animals** создал и заполнил файл Animals

>**cat Pets Animals > ManFriends** объединил файлы, новое название ManFriends

>**cat ManFriends** просмотретл содержимое файла ManFriends

* Создать директорию, переместить файл туда.

>**mkdir zoo** создал директорию zoo

>**mv ManFriends zoo/**  переместил ManFriends в директорию zoo

>**cd zoo** перешел в директорию

>**ls** - посмотрел список файлов и директорий

* Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.

>**https://hub.docker.com/_/mysql** выбрал контейнер с БД 

>**sudo su** зашел в рута

>**docker run --name MAYSQL -e MYSQL_ROOT_PASSWORD=1 -d mysql:8.0** скачал

>**docker images** посмотрели образ

>**docker ps -a** посмотрел список контейнеров

>**docker exec -it MAYSQL bash** запустил команду

>**mysql -u root -p** открыл БД

>**mysql> show databases;** проверил содержимое БД

* Установить и удалить deb-пакет с помощью dpkg.

>**wget https://download.virtualbox.org/virtualbox/7.0.6/virtualbox-7.0_7.0.6-155176~Ubuntu~jammy_amd64.deb** скачал virtualbox

>**sudo dpkg -i virtualbox-7.0_7.0.6-155176~Ubuntu~jammy_amd64.deb** установил скачанный пакет

>**sudo apt -f install** установил зависимости

>**rm -r virtualbox-7.0_7.0.6-155176~Ubuntu~jammy_amd64.deb** удалил скачанный файл deb

>**sudo dpkg -r virtualbox-7.0** удалил пакет

* В подключенном MySQL репозитории создать базу данных.

>**docker exec -it MAYSQL bash** запустил команду

>**mysql -u root -p** открыл БД

>**mysql> create database ManFriends;** создал db ManFriends

>**mysql> show databases;** проверил содержимое БД

* Заполнить низкоуровневые таблицы.

>**mysql> use ManFriends;** установил ManFriends в качестве текущей

>**mysql> create table Animals (id integer auto_increment primary key, name varchar(30), age integer);** создал таблицу Animals

>**mysql> create table Pets (id integer auto_increment primary key, name varchar(30), age integer);** создал таблицу Pets

>**mysql> insert into Animals (name, age) values ('first horse', 3);** добавил в таблицу Animals first horse

>**mysql> insert into Animals (name, age) values ('first camel', 5);** добавил в таблицу Animals first camel

>**mysql> insert into Animals (name, age) values ('first donkey', 4);** добавил в таблицу Animals first donkey

>**mysql> insert into Pets (name, age) values ('first hamster', 3);** добавил в таблицу Pets first hamster

>**mysql> insert into Pets (name, age) values ('first dog', 7);** добавил в таблицу Pets first dog

>**mysql> insert into Pets (name, age) values ('first cat', 5);** добавил в таблицу Pets first cat

>**mysql> select * from Animals;** получил всех Animals

>**mysql> select * from Pets;** получил всех Pets

* Удалить из таблицы верблюдов. Объединить таблицы Animals и Pets.

>**mysql> DELETE FROM Animals WHERE name='first camel';** удалил из Animals first camel

>**mysql> SELECT * FROM Animals INNER JOIN Pets;** объединил таблицы Animals и Pets

* Вывести новую таблицу в которую попадут все животные старше 1 года, но младше 3 лет, подсчитать общий возраст животных в новой таблице.

>**mysql> SELECT * FROM Animals WHERE age >= '1' AND age <= '3';** вывел всех животных старше 1 года, но младше 3 лет

>**mysql> SELECT SUM(age) FROM Animals;** вывел возраст всех животных

* Изменение таблиц и столбцов(ALTER TABLE).

>**ALTER TABLE Animals ADD leather VARCHAR(50);** добавил столбец

>**ALTER TABLE Animals MODIFY COLUMN leather CHAR(100);** изменил тип данных у leather

>**ALTER TABLE Animals DROP COLUMN leather;** удалил столбец