HOWTO Submit homework
---------------------

Step One, clone and cd into directory:

(don't clone if you've already done so previously)
git clone git@github.com:LibertyCSUIL/Programming-HW.git
cd ~/Programming\ Team/Github\ repos/Programming-HW/


Step Two, update the repository

git pull


Step Three, create and enter into your named working directory:

EXAMPLE: mkdir 2017/GavinD/

(don't create the directory if it already exists)
mkdir <year>/<name>/
cd <year>/<name>/


Step Four, move and add Java homework into current directory:

mv ~/Programming\ Team/Homework/Programming/<homework.class>
git add <homework.jar>


Step Five, commit name of homework with the date and time (military):

EXAMPLE: git commit -m "Input, 07/02/2017 06:27"

git commit -m "<homework>, <date> <time>"


Step Six, push changes:

git push origin master



REPEAT EVERY TIME 

(Grades will be posted as <homework>.txt in your named directory)
