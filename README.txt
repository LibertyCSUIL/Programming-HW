HOWTO Submit homework
---------------------

Step One, clone and cd into directory:

(don't clone if you've already done so previously)
git clone https://github.com/LibertyCSUIL/Programming-HW.git
cd ~/Programming\ Team/Github\ repos/Programming-HW/


Step Two, update the repository:

git pull


Step Three, create and enter into your named working directory:

EXAMPLE: mkdir 2017/GavinD/

(don't create the directory if it already exists)
mkdir <year>/<name>/
cd <year>/<name>/


Step Four, copy Java homework into current directory:

cp ~/Programming-HW/homework/<homework.java> $PWD


Step Five, complete homework.


Step Six, add the homework to the repository:

git add <homework.java>


Step Seven, commit the name of the homework with the date and time:

EXAMPLE: git commit -m "Input, 07/02/2017 06:27PM"

git commit -m "<homework>, <date> <time>"


Step Eight, push changes:

git push origin master



REPEAT EVERY TIME 

(Grades will be posted as <homework>.txt> in your named directory)
