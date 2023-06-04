#export NOM=$1
#export RACE=$2
#export AGE=$3
#export SEXE=$4

#[ $# -ne 4 ] && exit
#JSON="'{ \"name\": \"$NOM\", \"race\": \"$RACE\" \"age\": $AGE, \"sexe\": \"$SEXE\" }'"

#echo "JSON=$JSON"

#curl -i -X 'POST'  'http://localhost:8080/pets'  -H 'accept: application/json'  -H 'Content-Type: application/json'  -d $JSON


echo
echo
echo "---------------------------"
echo "Louki"
curl -i -X 'POST'  'http://localhost:8080/pets'  -H 'accept: application/json'  -H 'Content-Type: application/json'  -d'{ "name": "louki", "race": "boxer", "age": 8, "sexe": "M" }'

echo
echo
echo "---------------------------"
echo "Max"
curl -i -X 'POST'  'http://localhost:8080/pets'  -H 'accept: application/json'  -H 'Content-Type: application/json'  -d'{ "name": "max", "race": "labrador", "age": 3, "sexe": "F" }'

echo
echo
echo "---------------------------"
echo "Louka"
curl -i -X 'POST'  'http://localhost:8080/pets'  -H 'accept: application/json'  -H 'Content-Type: application/json'  -d'{ "name": "louka", "race": "bouledogue français", "age": 7, "sexe": "F" }'

echo
echo
echo "---------------------------"
echo "Jef"
curl -i -X 'POST'  'http://localhost:8080/pets'  -H 'accept: application/json'  -H 'Content-Type: application/json'  -d'{ "name": "jef", "race": "cocker", "age": 7, "sexe": "M" }'
