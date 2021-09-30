#pass cmdline arg 1->read hidden text; 2->write hidden text
import sys

path=input("enter path to a jpg file: ")
if(not(path.endswith('.jpg'))):
    print("not jpg file")
    sys.exit()
try:
    img=open(path,'rb+')
    img.seek(0)
    hexa=img.read().hex()
    if(len(sys.argv)>1):
        if (sys.argv[1]=='1'):
            #read hidden text
            offset=hexa.index('ffd9')
            img.seek(offset+2)
            msg=img.read().decode('ASCII')
            print(msg)
        elif (sys.argv[1]=='2'):
            #write hidden text
            offset=hexa.index('ffd9')
            img.seek(offset+2)
            msg=input("Enter hidden message")
            bytemsg=bytes(msg,'utf-8')
            img.write(bytemsg)
        else:
            print("err: bad argument!")
    else:
        print("err: no argument passed")
    img.close()
except IOError as e:
    print(f"err:{e.strerror}")
except:
   print("unexpected error!")
