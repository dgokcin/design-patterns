class Singleton:
    __instance = None

    @staticmethod
    def get_instance():

        """ Static access method. """
        if Singleton.__instance is None:
            Singleton()

        return Singleton.__instance


def __init__(self):
    """ Virtually private constructor. """
    if Singleton.__instance is None:
        raise Exception("This class is a singleton!")
    else:
        Singleton.__instance = self


s = Singleton()
# k = Singleton()

print(s)

s = Singleton.getInstance()
print(s)

s = Singleton.getInstance()
print(s)
