str="";
echo "Enter the decimal number";
read decimal;
while [ $decimal -gt 0 ]
do  
  num=$(( $decimal%2 ));
  str=$str$num;
  decimal=$(($decimal/2 )); 
done
final=$(echo "$str" | rev);
echo "Decimal to binary: $final";

echo "Enter the binary to convert to decimal "
read n
b=$(echo "obase=10;ibase=2;$n" | bc)
echo "Binary value is : $b"

