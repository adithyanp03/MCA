echo "Enter your basic salary:"
read basic
if [ $basic -lt 15000 ];
then
	 hra=`echo $basic \* 0.10 | bc`
	 echo "HRA=$hra"
	 da=`echo $basic \* 0.95 | bc`
	 echo "DA=$da"
else
	hra=1500
	echo "HRA=$hra"
	da=`echo $basic \* 0.95 | bc`
	echo "DA=$da"
fi

gross=`echo $basic+$hra+$da | bc`
echo "Gross salary is : $gross"
